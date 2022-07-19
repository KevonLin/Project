package com.swing.jdbc;

//import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author lin
 */
public class Jdbcconnection {
    private String url = "jdbc:mysql://localhost:3306/swing_jdbc?characterEncoding=utf-8";
    private String driver = "com.mysql.jdbc.Driver";
    private String name = "root";
    private String pass = "Lzm91018";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, name, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        JdbcConnection jdbcconnection = new JdbcConncetion();
        Connection conn = jdbcconnection.getConnection();
        if (conn != null) {
            System.out.println("数据库连接成功!");
        }
    }
}
