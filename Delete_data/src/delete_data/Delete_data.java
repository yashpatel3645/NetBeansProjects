
package delete_data;
import java.sql.*;
public class Delete_data {
    public static void main(String[] args) {
    
     try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
            Statement st = con.createStatement();
            int rs = st.executeUpdate("Delete from APOLLO where NAME ='jaimin'");
            if(rs!=0)
            {
                System.out.println("Record Deleted");
            }
            else
            {
                System.out.println("Record Not Deleted");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Error is"+e.toString());
        }
    }
}
