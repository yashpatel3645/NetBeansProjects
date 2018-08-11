
package pkg12;
import java.sql.*;
/**
 *
 * @author King_Heart
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("jdbc:derby://localhost:1527/yash [yash on YASH]");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/yash"+"yash"+12345678);
            Statement st = con.createStatement();
            int rs = st.executeUpdate("insert into apollo values('yash',1234567890)");
            System.out.println("record iserted"+rs);
        }
        catch(Exception e)
        {
            System.out.println("Error is"+e.tostring());
        }
    }
    
}
