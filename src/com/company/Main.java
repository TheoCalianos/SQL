package com.company;

import tables.school_body;

import java.sql.*;
public class Main {

    public static void main(String args[]) throws SQLException {


        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM School");){
            //school_body.getStudents(rs);
            rs.last();

            System.out.println("Last Student is " + rs.getInt("Student Id") + " " + rs.getString("Student Name"));

            rs.first();
            System.out.println("First Student is " + rs.getInt("Student Id") + " " + rs.getString("Student Name"));

            rs.absolute(2);
            System.out.println("Student is " + rs.getInt("Student Id") + " " + rs.getString("Student Name"));

        }
        catch (SQLException e)
        {
            System.err.print(e);
        }
    }
}
