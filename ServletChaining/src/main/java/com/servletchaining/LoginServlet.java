package com.servletchaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		
		String email= req.getParameter("email");
		String password= req.getParameter("pass");
		
		String demail="parthisanjay7@gmail.com";
		String dpassword="8248847857";
		
		if(email.equals(demail) && password.equals(dpassword)){
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("response.html");
			dispatcher.forward(req, resp);
		}
		else {
			PrintWriter out=resp.getWriter();
			out.print("<h1>Invalid Email and Password</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
