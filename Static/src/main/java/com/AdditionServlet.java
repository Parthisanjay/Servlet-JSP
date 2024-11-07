package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1=req.getParameter("n1");
		String num2=req.getParameter("n2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		int result=n1+n2;
		
		String html="<h1> Result :"+result+"</h1>";
		
		PrintWriter out=res.getWriter();
		
		out.print(html);
		
		//direct method
//		res.getWriter().print(html);
	}

}
