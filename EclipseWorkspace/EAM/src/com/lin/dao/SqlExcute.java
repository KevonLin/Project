package com.lin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

import javax.swing.JTable;

import com.lin.utils.JDBCUtils;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月26日 下午4:52:34
 */

public class SqlExcute {

	private Connection conn;
	private PreparedStatement ps;
	private boolean isRowNull;

	public void sqlExcute(String sql, Object... args) {
		try {
			// 获取sql连接
			conn = JDBCUtils.getConnection();
			// 预处理sql语句
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps);
		}
	}

	public Vector<Object> getRowData(JTable table) {
		// 获取点击的行
		int row = table.getSelectedRow();
		if (row < 0) {
			setRowNull(true);
			return null;
		}
		// 获取列数量，便于循环计数
		int columnCount = table.getColumnCount();
		// 创建存放表格数据的向量
		Vector<Object> vec = new Vector<Object>();
		// 循环将该行的数据放入
		Object data;
		// System.out.println(table.getValueAt(0, 1));
		for (int column = 0; column < columnCount; column++) {
			data = table.getValueAt(row, column);
			vec.add(data);
		}
		return vec;
	}

	public boolean isRowNull() {
		return isRowNull;
	}

	public void setRowNull(boolean isRowNull) {
		this.isRowNull = isRowNull;
	}

}
