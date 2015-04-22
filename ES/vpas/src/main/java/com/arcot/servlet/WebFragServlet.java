package com.arcot.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Balaji Nandarapu
 *
 */
@WebServlet(name = "mytest", urlPatterns = { "/WebFragServlet" })
public class WebFragServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Web Fragment Servlet:" + new Date());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello from webfragment servlet");
	}
}