package swing.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConnect {
	//数据库的链接url
	private String url="jdbc:mysql://localhost:3306/swing_jdbc?characterEncoding=utf-8";
	//数据库的链接驱动
	private String driver="com.mysql.jdbc.Driver";
	private String name="root";
	private String pass="root";
	
	public Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, pass);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static void main(String[] args) {
		JdbcConnect connect = new JdbcConnect();
		Connection con = connect.getConnection();
		if (con!=null) {
			System.out.println("数据库链接成功");
		}
	}

}
