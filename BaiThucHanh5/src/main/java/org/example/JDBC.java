package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static Connection Connection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/ebookshop";
        String username="root";
        String password="030502";
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}
