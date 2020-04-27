package com.company;

import tables.school_body;

import java.sql.*;
public class Main {

    private static final String SQL = "SELECT * FROM School WHERE StudentName LIKE?";
    public static void main(String args[]) throws SQLException {
        String name;
        try{
            name = Input.getString("enter name of student");
        }
        catch (Exception e)
        {
            System.err.println("Invalid name");
            return;
        }
        ResultSet rs = null;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,name);

            rs = stmt.executeQuery();
            school_body.getStudents(rs);
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        finally {
            if(rs != null){
                rs.close();
            }
        }
    }
}
