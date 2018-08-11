import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class view extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","yash","yash");
    PreparedStatement pst=con.prepareStatement("selct * from Apollo ");
            
        out.print("<table border=2>");
        out.print("<tr>");
        out.print("<th>First Name</th>");
        out.print("<th>Middle Name</th>");
        out.print("<th>Last Name</th>");
        
        out.print("</tr>");
        
        ResultSet rs = pst.executeQuery();
        while(rs.next())
        {
            out.print("<tr>");
            out.print("<td>"+rs.getString(1)+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>");
            out.print("<td>"+rs.getString(3)+"</td>");
        }
    }
           catch(Exception e)
    {
        System.out.println("Error is"+e.toString());
}
    }
}
