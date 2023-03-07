package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.json.JsonObject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author subha
 */
public class SecondServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException { 
        res.setContentType("application/json");
        PrintWriter out = res.getWriter();
        /**
         * Creating cookie object...
         */
        Cookie ck = new Cookie("name",req.getRemoteHost().toString() );
        ck.setHttpOnly(true);
        ck.setMaxAge(6000);
        
        /**
         * Adding the cookie object inside the response...
         */
        res.addCookie(ck);
        RequestDispatcher rd = req.getRequestDispatcher("pages/Home.html");
        
        rd.forward(req, res);
    }
}
