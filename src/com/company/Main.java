package com.company;
import java.sql.*;
public class Main {
    //private static final String USERNAME = "TheoCalianos";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    //private static final String PASSWORD = "TheoCalianos";
    private static final String CONN = "jdbc:mysql://localhost:3306/college";
    public static void main(String args[]) throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection(CONN,USERNAME,PASSWORD);
        System.out.println("Connected");
    }
}
