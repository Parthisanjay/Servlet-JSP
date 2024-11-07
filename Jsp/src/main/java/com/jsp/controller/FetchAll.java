package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import com.jsp.dto.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getall")
public class FetchAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select e from Employee e");
		
		List<Employee> list = q.getResultList();
		
		req.setAttribute("l", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("getAll.jsp");
		dispatcher.forward(req, resp);
	}
}
