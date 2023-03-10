/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 *
 * @author subha
 */
public class FileServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            RequestDispatcher rd = request.getRequestDispatcher("pages/Home.html");
            
            rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            processRequest(request, response);
                String desc = request.getParameter("desc");
                
                System.out.println(desc);
                try{
                    File newfile = new File("1.txt");
                    FileWriter writer = new FileWriter(newfile);
                    writer.write(desc.toString());
                    
                    writer.close();
                    PrintWriter out = response.getWriter();
                    response.setContentType("application/json");
                    out.println("{\"msg\":\""+desc+"\"}");
                }catch(IOException e){
                    System.out.println("com.first.FileServlet.doPost()");
                }
                
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
        
}
