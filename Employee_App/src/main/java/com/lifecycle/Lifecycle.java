package com.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life")
public class Lifecycle extends GenericServlet {
	
	@Override
	public void destroy() {
		System.out.println("Hi i am destroy method");
	}
	
	@Override
	public void init() {	
		System.out.println("Hi i am init method");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hi i am Service method");
		
		int c=0;
		
		PrintWriter out=res.getWriter();
		
		out.print("<h1>"+"Count :"+c+"</h1>");
	}

}
