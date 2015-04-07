package com.arcot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Logger;

@WebServlet(name="mytest",urlPatterns={"/WebFragServlet"})
public class WebFragServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println("Web Fragment Servlet:" + new Date());


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello from webfrag servlet");
    }
}