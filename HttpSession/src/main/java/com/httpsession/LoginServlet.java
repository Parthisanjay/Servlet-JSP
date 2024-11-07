package com.httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		String demail = "parthisanjay7@gmail.com";
		String dpass = "12345";
		
		if(email.equals(demail) && pass.equals(dpass)) {
			//session create
			HttpSession session = req.getSession(true);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("view");
			dispatcher.forward(req, resp);
		}
		else {
			resp.getWriter().print("<h1>Invalid Email or password</h1>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
