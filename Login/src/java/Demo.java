import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class Demo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if(pass.equals("123")&&uname.equals("yash"))
        {
            RequestDispatcher rd = request.getRequestDispatcher("Login1");
            rd.forward(request, response);
        }
        else
        {
            out.print("Invalid Username Or Password...<br><br>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }           
    }
}