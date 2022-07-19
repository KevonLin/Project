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
 * @date 2021/6/4 ����6:41
 */
public class SqlOperation {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //ͨ�ò�ѯ����
    public MyBook queryForMyBook(String sql, Object... args) {
 
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            //��ȡ�������Ԫ����
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
            	MyBook employees = new MyBook();

                //����������ÿһ�����ݵ�ÿһ��
                for (int i = 0; i < columnCount; i++) {
                    //��ȡ��ֵ
                    Object columnValue = rs.getObject(i + 1);

                    //��ȡÿ���е�����
                    String columnName = rsmd.getColumnName(i + 1);

                    //��employeesָ����ĳ�����Ը�ֵΪvalue
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

    //ͨ����ɾ��
    public void Update(String sql, Object... args){
        //ռλ���ĳ��ȺͿɱ��βγ�����ͬ
//        Connection conn = null;
//        PreparedStatement ps = null;
        try {
            //1.��ȡ����
            conn = JDBCUtils.getConnection();
            //2.Ԥ����
            ps = conn.prepareStatement(sql);
            //3.������
            for (int i = 0; i < args.length; i++) {
                //һ���Ӳ�����1��ʼ �����0��ʼ
                ps.setObject(i + 1, args[i]);
            }
            //4.ִ��sql
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //5�ر���Դ
            JDBCUtils.closeResource(conn, ps);
        }
    }
    
    /*
    public MyBook Query(String fullName) {

        try {
            //1.��ȡ����
            conn = JDBCUtils.getConnection();
            //2.Ԥ����
            String sql = "select * from gys where full_name  = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, fullName);

            //3.ִ�з��ؽ����
            rs = ps.executeQuery();
            //4.�������� �ж��Ƿ���Чһ�����ݣ��з���true���޷���false
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

                //��װΪ����
                MyBook msg = new MyBook();
                System.out.println(msg);
                return msg;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.�ر���Դ
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }
    */
    
}
