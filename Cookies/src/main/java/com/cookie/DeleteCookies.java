package com.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletecookie")
public class DeleteCookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie arr[]=req.getCookies();
		
		for(Cookie c: arr) {
			if(c.getName().equals("email")){
				c.setMaxAge(0);
				resp.addCookie(c);
				resp.getWriter().print("<h1>Cookies Deleted</h1>");
			}		
		}
	}
}
