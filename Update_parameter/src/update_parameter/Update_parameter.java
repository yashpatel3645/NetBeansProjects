
package update_parameter;
import java.sql.*;

import java.sql.PreparedStatement;

public class Update_parameter {

    public static void main(String[] args) {
        try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
    PreparedStatement pst=con.prepareStatement("insert into APOLLO values(?,?)");
    pst.setString(1,"jaimin");
    pst.setInt(2,667476546);
    int rs=pst.executeUpdate();
    System.out.println("Record Inserted..."+rs);
    con.close();
}
    catch(Exception e)
    {
        System.out.println("Error is"+e.toString());
}
}
}