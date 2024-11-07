package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DynamicServlet extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		Date d=new Date();
		
		PrintWriter out=res.getWriter();
		
		String html="<html>"
				   +"<body>"
				   +"<h1>Current date and time :"+ d.toString()+"</h1>"
				   +"</body>"
				   +"</html>";
		out.print(html);
	}

}
