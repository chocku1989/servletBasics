package com.training.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {


	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init called");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1> welcome to first servlet"+ new Date()+"</h1>");
		
		System.out.println("<h1> welcome to first servlet"+ new Date()+"</h1>");
	}

}
