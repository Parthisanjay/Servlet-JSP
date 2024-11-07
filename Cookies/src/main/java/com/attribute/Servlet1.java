package com.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student s= new Student(1,"Partha",25,123);
		
		ServletContext context= getServletContext();
		
		context.setAttribute("std",s);
		
		resp.getWriter().print("<h1>Attributes Added</h1>");
	}
}
