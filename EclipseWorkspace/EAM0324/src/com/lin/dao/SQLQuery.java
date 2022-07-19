package com.lin.dao;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

import com.lin.bean.EamData;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月23日 下午4:37:14
 */

public class SQLQuery {
//	public static void main(String[] args) throws Exception {
//		EamData data = new DBAccount();
//		data = getInstance(data, "SELECT * FROM account WHERE username=?;", "kevonlin");
//		System.out.println(data.getUsername());
//		System.out.println(data);
//	}

	public static EamData getInstance(EamData data, String sql, Object... args) throws Exception {
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

		EamData eam = null;

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

}
