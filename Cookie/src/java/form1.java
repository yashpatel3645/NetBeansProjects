import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class form1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        String text = request.getParameter("text");
        Cookie cookie = new Cookie("My_Cookie",text);
        response.addCookie(cookie);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>MyCookie has been set to:");
        out.println(text);
        out.println("<br><br><br>");
        out.println("This Page shows that the cookie has been added.");
        
        RequestDispatcher rd = request.getRequestDispatcher("form2");
            rd.forward(request, response);
        out.close();
    }   
}
