package com.lin.dao;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.lin.bean.EamData;
import com.lin.utils.JDBCUtils;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月23日 下午4:37:14
 */

public class SqlQuery {
	// public static void main(String[] args) throws Exception {
	// EamData data = new DBAccount();
	// data = getInstance(data, "SELECT * FROM account WHERE username=?;",
	// "kevonlin");
	// System.out.println(data.getUsername());
	// System.out.println(data);
	// }

	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static ResultSetMetaData rsmd;
	private Statement stmt;

	public static EamData getInstance(String sql, Object... args) throws Exception {
		InputStream is = ClassLoader.getSystemResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		pros.load(is);
		// 获取文件加载
		String url = pros.getProperty("url");
		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		Class.forName(pros.getProperty("driverClass"));

		conn = DriverManager.getConnection(url, user, password);

		EamData eam = null;

		ps = conn.prepareStatement(sql);
		for (int i = 0; i < args.length; i++) {
			ps.setObject(i + 1, args[i]);
		}
		rs = ps.executeQuery();
		rsmd = rs.getMetaData();
		String columnName = null;
		int columnCount = rsmd.getColumnCount();

		while (rs.next()) {
			eam = EamData.class.newInstance();
			for (int i = 1; i <= columnCount; i++) {
				columnName = rsmd.getColumnLabel(i);
				Field field = EamData.class.getDeclaredField(columnName);
				field.setAccessible(true);
				field.set(eam, rs.getObject(i));
			}
			return eam;
		}
		return eam;
	}

	public void queryAll(DefaultTableModel tableModel, Object[] column, String sql) {
		try {
			// 字段名
			Vector<String> columnName = new Vector<String>();
			// 存储所有数据
			Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
			for (int i = 0; i < column.length; i++) {
				columnName.add((String) column[i]);
			}

			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// 就是这个存单行的，最后放到上面的大的Vector里面
				Vector<Object> vec = new Vector<Object>();
				for (int i = 1; i <= column.length; i++) {
					vec.add(rs.getObject(i));
				}
				dataVector.add(vec);
			}
			// DefaultTableModel tmhavesold = new DefaultTableModel();// 建立默认的JTable模型
			// 设定模型数据和字段
			tableModel.setDataVector(dataVector, columnName);
			JDBCUtils.closeResource(JDBCUtils.getConnection(), stmt);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
	}

	public void querySingle(DefaultTableModel tableModel, Object[] column, String sql, Object... args) {
		try {
			// 字段名
			Vector<String> columnName = new Vector<String>();
			// 存储所有数据
			Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
			for (int i = 0; i < column.length; i++) {
				columnName.add((String) column[i]);
			}

			stmt = JDBCUtils.getConnection().createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// 就是这个存单行的，最后放到上面的大的Vector里面
				Vector<Object> vec = new Vector<Object>();
				for (int i = 1; i <= column.length; i++) {
					vec.add(rs.getObject(i));
				}
				dataVector.add(vec);
			}
			// 设定模型数据和字段
			tableModel.setDataVector(dataVector, columnName);
			JDBCUtils.closeResource(JDBCUtils.getConnection(), stmt);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
	}

	// 通用查询操作
	public boolean sqlQuery(DefaultTableModel tableModel, String[] column, String sql, Object... args) {

		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();

			Vector<String> columnName = new Vector<String>();
			Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>();
			for (int i = 0; i < column.length; i++) {
				columnName.add(column[i]);
			}
			while (rs.next()) {
				Vector<Object> vec = new Vector<Object>();
				for (int i = 1; i <= column.length; i++) {
					vec.add(rs.getObject(i));
				}
				dataVector.add(vec);
			}
			tableModel.setDataVector(dataVector, columnName);
			if (dataVector.isEmpty()) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
		return true;
	}
}
