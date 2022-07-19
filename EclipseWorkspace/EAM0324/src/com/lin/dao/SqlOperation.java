package com.lin.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.lin.bean.DBAccount;
import com.lin.bean.EamData;
import com.lin.utils.JDBCUtils;

/**
 * @author lin
 * @date 2021/6/4 下午6:41
 */
public class SqlOperation {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// @Test
	// public void test() {
	// String sql = "select bNum,bName from Book where bNum = ?";
	// EamData book = queryForEamData(sql, 1);
	// System.out.println(book);
	// }

	public DBAccount queryForUsrPwd(String sql, String usr) {
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			ps.setObject(1, usr);
			// 4.执行sql
			rs = ps.executeQuery();

			if (rs.next()) {
				int account_id = rs.getInt("account_id");
				String username = rs.getString("username");
				String password = rs.getString("password");

				DBAccount account = new DBAccount(account_id, username, password);
				return account;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
		return null;
	}

	// 通用查询操作
	public EamData queryForEamData(String sql, Object... args) {

		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();
			// 获取结果集的元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			if (rs.next()) {
				EamData eamData = new EamData();

				// 处理结果集中每一行数据的每一列
				for (int i = 0; i < columnCount; i++) {
					// 获取列值ֵ
					Object columnValue = rs.getObject(i + 1);

					// 获取每个列的列名
					String columnName = rsmd.getColumnName(i + 1);

					// 给books指定的某个属性赋值为value
					Field field = EamData.class.getDeclaredField(columnName);
					field.setAccessible(true);
					field.set(eamData, columnValue);
				}
				return eamData;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
		return null;
	}

	// 占位符的长度和可变形参长度相同
	public void Update(String sql, Object... args) {
		// 占位符的长度和可变形参长度相同
		// Connection conn = null;
		// PreparedStatement ps = null;
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			// 4.执行sql
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
	}

}
