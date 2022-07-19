package com.dao;

import com.bean.MyBook;
import java.lang.reflect.Field;
import com.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author lin
 * @date 2021/6/4 下午6:41
 */
public class SqlOperation {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //通用查询操作
    public MyBook queryForMyBook(String sql, Object... args) {
 
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
            	MyBook employees = new MyBook();

                //处理结果集中每一行数据的每一列
                for (int i = 0; i < columnCount; i++) {
                    //获取列值
                    Object columnValue = rs.getObject(i + 1);

                    //获取每个列的列名
                    String columnName = rsmd.getColumnName(i + 1);

                    //给employees指定的某个属性赋值为value
                    Field field = MyBook.class.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(employees, columnValue);
                }
                return employees;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }

    //通用增删改
    public void Update(String sql, Object... args){
        //占位符的长度和可变形参长度相同
//        Connection conn = null;
//        PreparedStatement ps = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.预处理
            ps = conn.prepareStatement(sql);
            //3.给参数
            for (int i = 0; i < args.length; i++) {
                //一个从参数从1开始 数组从0开始
                ps.setObject(i + 1, args[i]);
            }
            //4.执行sql
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //5关闭资源
            JDBCUtils.closeResource(conn, ps);
        }
    }
    
    /*
    public MyBook Query(String fullName) {

        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.预处理
            String sql = "select * from gys where full_name  = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, fullName);

            //3.执行返回结果集
            rs = ps.executeQuery();
            //4.处理结果集 判断是否有效一条数据，有返回true，无返回false
            if (rs.next()) {
                String full_name = rs.getString("full_name");
                String name = rs.getString("name");
                int zip = rs.getInt("zip");
                String address = rs.getString("address");
                String telephone = rs.getString("telephone");
                String tel = rs.getString("tel");
                String pname = rs.getString("pname");
                String phone = rs.getString("phone");
                String bank = rs.getString("bank");
                String email = rs.getString("email");

                //封装为对象
                MyBook msg = new MyBook();
                System.out.println(msg);
                return msg;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }
    */
    
}
