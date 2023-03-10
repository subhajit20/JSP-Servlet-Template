
package com.first;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class ThirdServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
        
        // with help of res.sendRedirect method we can redirect the request to another servlet
        res.sendRedirect("/my-web-app/app");

    }
}
