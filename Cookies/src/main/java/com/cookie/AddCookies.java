package com.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcookie")
public class AddCookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//persistence cookie
		Cookie c1= new Cookie("email","parthisanjay7@gmail.com");
		c1.setMaxAge(60*60);
		
		//non-persistence cookie
		Cookie c2= new Cookie("pass","123");
		
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		resp.getWriter().print("<h1>Cookies Added</h1>");
	}
}
