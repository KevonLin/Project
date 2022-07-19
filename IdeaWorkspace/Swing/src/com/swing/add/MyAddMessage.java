package com.swing.add;

import com.swing.jdbc.Jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Lin
 */
public class MyAddMessage {
    //添加方法
    public int addMessage() throws SQLException {
        Jdbcconnection connect = new Jdbcconnection();
        Connection conn = connect.getConnection();

        String sql = "insert into message (id, name) values (?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        return 0;
    }
}
