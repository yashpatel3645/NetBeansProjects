import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class form2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie[] my_cookies=request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<br>");
        int n = my_cookies.length;
        for(int i=0;i<n;i++)
        {
            String name=my_cookies[i].getName();
            String value=my_cookies[i].getValue();
            out.println("name= "+name);
            out.println("and value= "+value);
        }
        out.close();
    }

}
