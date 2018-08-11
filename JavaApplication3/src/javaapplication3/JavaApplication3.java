package javaapplication3;
import java.sql.*;
public class JavaApplication3 {
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
            Statement st = con.createStatement();
            int rs = st.executeUpdate("insert into apollo values('Nisha',6875238)");
            System.out.println("record iserted"+rs);
        }
        catch(Exception e)
        {
            System.out.println("Error is"+e.toString());
        }
    }
    
}
