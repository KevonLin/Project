package com.dao;

import com.bean.MyBook;
import java.lang.reflect.Field;
import com.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.junit.Test;

/**
 * @author lin
 * @date 2021/6/4 下午6:41
 */
public class SqlOperation {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

//	@Test
//	public void test() {
//		String sql = "select bNum,bName from Book where bNum = ?";
//		MyBook book = queryForMyBook(sql, 1);
//		System.out.println(book);
//	}

	public MyBook QueryForAll(String sql, String b_Num) {
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			ps.setObject(1, b_Num);
			// 4.执行sql
			rs = ps.executeQuery();

			if (rs.next()) {
				String bNum = rs.getString("bNum");
				String bName = rs.getString("bName");
				String bType = rs.getString("bType");
				String bAuth = rs.getString("bAuth");
				String bPublishing = rs.getString("bPublishing");
				String bInventory = rs.getString("bInventory");
				String pNum = rs.getString("pNum");
				String pName = rs.getString("pName");
				String pType = rs.getString("pType");
				String pPhone = rs.getString("pPhone");
				String pAddr = rs.getString("pAddr");

				MyBook book = new MyBook(bNum, bName, bType, bAuth, bPublishing, bInventory, pNum, pName, pType, pPhone,
						pAddr);
//				System.out.println(book);
				return book;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
		return null;
	}

	public MyBook QueryForBook(String sql, String b_Num) {
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			ps.setObject(1, b_Num);
			// 4.执行sql
			rs = ps.executeQuery();

			if (rs.next()) {
				String bNum = rs.getString("bNum");
				String bName = rs.getString("bName");
				String bType = rs.getString("bType");
				String bAuth = rs.getString("bAuth");
				String bPublishing = rs.getString("bPublishing");
				String bInventory = rs.getString("bInventory");

				MyBook book = new MyBook(bNum, bName, bType, bAuth, bPublishing, bInventory);
//				System.out.println(book);

				return book;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
		return null;
	}

	public MyBook QueryForPub(String sql, String b_Num) {
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			ps.setObject(1, b_Num);
			// 4.执行sql
			rs = ps.executeQuery();

			if (rs.next()) {
				String pNum = rs.getString("pNum");
				String pName = rs.getString("pName");
				String pType = rs.getString("pType");
				String pPhone = rs.getString("pPhone");
				String pAddr = rs.getString("pAddr");

				MyBook book = new MyBook(pNum, pName, pType, pPhone, pAddr);
//				System.out.println(book);

				return book;
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
	public MyBook queryForMyBook(String sql, Object... args) {

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
				MyBook books = new MyBook();

				// 处理结果集中每一行数据的每一列
				for (int i = 0; i < columnCount; i++) {
					// 获取列值ֵ
					Object columnValue = rs.getObject(i + 1);

					// 获取每个列的列名
					String columnName = rsmd.getColumnName(i + 1);

					// 给books指定的某个属性赋值为value
					Field field = MyBook.class.getDeclaredField(columnName);
					field.setAccessible(true);
					field.set(books, columnValue);
				}
				return books;
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
//        Connection conn = null;
//        PreparedStatement ps = null;
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
