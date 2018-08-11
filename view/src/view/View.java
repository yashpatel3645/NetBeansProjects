package view;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class View {
    public static void main(String[] args) {
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
            Statement st = con.createStatement();
            boolean rst = st.execute("Create view yashvie as select * from APOLLO");
            System.out.println("View Created");
            ResultSet rs = st.executeQuery("select * from yashvie");
            int i=0;
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            con.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
}
