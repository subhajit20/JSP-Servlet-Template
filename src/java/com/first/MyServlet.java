package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.Cookie;

public class MyServlet implements Servlet {
     private ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Server initializing");
    }
    public  void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        System.out.println("Details ----->"+req.getRemoteHost());
        
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        
        out.println("Helloooooooooooooo");
    }
    public void destroy(){
        System.out.println("Servlet is going to be destroyed...");
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
