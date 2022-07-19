package swing.jdbc.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import swing.javabean.com.Message;
import swing.utils.JdbcConnect;

public class MyaddMessage {
	int a[]={1,2,3};
	
	//实现数据库数据的添加
	public int addMessage(Message m){
		
		String sql="insert into message (name,addtime) values(?,?)";
		JdbcConnect connect = new JdbcConnect();
		Connection conn = connect.getConnection();
		int insert=0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setDate(2, new Date(m.getAddtime().getTime()));
			insert = ps.executeUpdate();
			if (insert!=0) {
				System.out.println("数据库数据添加成功");
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		return insert;
		
	}
	
	public List<Message> getlistMessage(){
		
		Map person=new HashMap();

		int a[]=new int[12];
		String sql ="select * from message";
		JdbcConnect connect = new JdbcConnect();
		Connection conn = connect.getConnection();
		PreparedStatement ps=null;
		List<Message> list = new ArrayList<>();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Message message = new Message();
				message.setId(rs.getInt(1));
				message.setName(rs.getString(2));
				message.setAddtime(rs.getDate(3));
				list.add(message);
				
				
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		return list;
	} 
	
}
