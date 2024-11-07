package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Employee;

public class EmployeeDao {

	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	static EntityManager em= emf.createEntityManager();
	static EntityTransaction et= em.getTransaction();
	
	public void saveEmployee(Employee e) {
		et.begin();
		em.persist(e);
		et.commit();
		
		System.out.println("Data Inserted");
	}
	
	public Employee getEmployeeById(int id) {
		
		System.out.println("Data Fetched");
		
		return em.find(Employee.class,id);
		
	}
	
	public String deleteById(int id) {
		
		Employee e=em.find(Employee.class,id);
		
		if(e!=null) {
			et.begin();
			em.remove(e);
			et.commit();
			
			return "Data removed";
		}
		else {
			return "Data Not Found";
		}
	}
}
