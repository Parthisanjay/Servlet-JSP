package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServelet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		
		String html="<html>"
				   +"<body>"
				   +"<h1> Email :"+email+"</h1>"
				   +"<h1> Password :"+password+"</h1>"
				   +"</body>"
				   +"</html>";
		out.print(html);
	}

}
