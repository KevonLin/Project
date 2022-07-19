package com.lin.dao;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月23日 下午4:37:14
 */

public class CurrencyOptions {
	public static void main(String[] args) throws Exception {
//		List<DBAccount> list = null;
//		list = getInstance(DBAccount.class, "SELECT * FROM account WHERE username=?;", "kevonlin");
//		System.out.println(list);
//		for (DBAccount e : list) {
//			System.out.println(e.toString());
//		}
	}

	public static <T> List<T> getInstance(Class<T> clazz, String sql, Object... args) throws Exception {
		// 这个泛类用来接收占位符
		InputStream is = ClassLoader.getSystemResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		pros.load(is);
		// 获取文件加载
		String url = pros.getProperty("url");
		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		Class.forName(pros.getProperty("driverClass"));

		Connection conn = DriverManager.getConnection(url, user, password);

		List<T> list = new ArrayList<T>();

		// 面向接口编程，导入的是Java的接口
		PreparedStatement ps = conn.prepareStatement(sql);
		for (int i = 0; i < args.length; i++) {
			ps.setObject(i + 1, args[i]);
		}
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		String columnName = null;
		int columnCount = rsmd.getColumnCount();

		while (rs.next()) {
			T t1 = clazz.newInstance();
			for (int i = 1; i <= columnCount; i++) {
				columnName = rsmd.getColumnLabel(i);
				Field field = clazz.getDeclaredField(columnName);
				field.setAccessible(true);
				field.set(t1, rs.getObject(i));
				System.out.println("t1:" + t1);
				System.out.println("rs.getObject(" + i + "):" + rs.getObject(i));
				System.out.println("field:" + field);
				System.out.println("columnName: " + columnName);
			}
			list.add(t1);
		}
		return list;
	}

}
