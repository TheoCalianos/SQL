package com.company;
import java.sql.*;

import java.sql.Connection;

public class DBConnection {
    //private static final String USERNAME = "TheoCalianos";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    //private static final String PASSWORD = "TheoCalianos";
    private static final String CONN = "jdbc:mysql://localhost:3306/college";
    public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
    }
}
