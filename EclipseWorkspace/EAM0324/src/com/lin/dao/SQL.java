package com.lin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import org.junit.Test;

import com.lin.bean.DBAccount;
import com.lin.bean.DBAsset;
import com.lin.utils.JDBCUtils;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月23日 下午5:33:29
 */

public class SQL {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Test
	public void test() {
		String sql = "SELECT * FROM account WHERE username=?;";
		DBAccount ac = queryUserPwd(sql, "kevonlin");
		
		String sql2 = "select * from asset where asset_id=?;";
		DBAsset as = queryAsset(sql2, "1");
		
		System.out.println(ac.getPassword());
		System.out.println(as.getPname());
		
		String sql3 = "select * from account where username=?";
		query(sql3, "kevonlin");
	}
	
	public void query(String sql, Object... args) {
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

	public DBAccount queryUserPwd(String sql, String usr) {
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

	public DBAsset queryAsset(String sql, String id) {
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			// 2.预处理
			ps = conn.prepareStatement(sql);
			// 3.给参数
			ps.setObject(1, id);
			// 4.执行sql
			rs = ps.executeQuery();

			if (rs.next()) {
				int asset_id = rs.getInt("asset_id");
				String pnum = rs.getString("pnum");
				String pname = rs.getString("pname");
				Date pdate = rs.getDate("pdate");
				int presidue = rs.getInt("presidue");

				DBAsset asset = new DBAsset(asset_id, pnum, pname, pdate, presidue);
				return asset;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
		return null;
	}
}
