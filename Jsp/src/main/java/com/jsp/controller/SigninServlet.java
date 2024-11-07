package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.jsp.dto.Employee;
import com.jsp.dao.EmployeeDao;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		Double sal=Double.parseDouble(req.getParameter("sal"));
		String job=req.getParameter("job");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		Employee e=new Employee();
		
		e.setName(name);
		e.setEmail(email);
		e.setGender(gender);
		e.setJob(job);
		e.setPassword(pass);
		e.setPhone(phone);
		e.setSal(sal);
		
		EmployeeDao dao= new EmployeeDao();
		dao.saveEmployee(e);
		
		req.setAttribute("Emp", e);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Signin.jsp");
		dispatcher.forward(req, res);
		
	}
}
