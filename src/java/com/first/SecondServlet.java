package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.json.JsonObject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

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
        File newfile = new File("1.txt");
        newfile.createNewFile();
        System.out.println("New file has been created...");
        /**
         * Adding the cookie object inside the response...
         */
        res.addCookie(ck);
        Cookie[] cook = req.getCookies();
        String mycookie = "";
        
        // Parsing cookie
        for(Cookie c:cook){
            String name = c.getName();
            if(name.equals("name")){
                mycookie = c.getValue().toString();
                break;
            }
        }
        System.out.println(mycookie);
        RequestDispatcher rd = req.getRequestDispatcher("pages/Home.html");
        
        rd.forward(req, res);
    }
}
