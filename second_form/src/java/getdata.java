import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class getdata extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        
        String lname = request.getParameter("lname");
        try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
    PreparedStatement pst=con.prepareStatement("insert into APOLLO values(?,?,?)");
    pst.setString(1,fname);
    pst.setString(2,mname);
    pst.setString(3, lname);
    int rs=pst.executeUpdate();
    out.println("Record Inserted..."+rs);
    
    con.close();
}
    catch(Exception e)
    {
        System.out.println("Error is"+e.toString());
}
    }

}
