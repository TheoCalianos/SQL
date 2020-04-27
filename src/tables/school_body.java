package tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class school_body {
    public static void getStudents(ResultSet rs) throws SQLException {
        while(rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Student ID" + rs.getInt("Student Id"));
            buffer.append(rs.getString("StudentName"));
            //System.out.println(buffer.toString());

        }
    }
}
