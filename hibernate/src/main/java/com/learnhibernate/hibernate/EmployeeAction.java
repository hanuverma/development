package com.learnhibernate.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class EmployeeAction {
	
	public static void main(String[] args) {
		
		FindAllUser();
		
		HibernateUtils.shutdown();
	}
	
	private void CreateUser() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setUserName("userName1");
		emp.setPassword("password1");
		
		EmpAddress address= new EmpAddress(); 
		address.setEmp(emp);
		address.setCity("noida");
		address.setCountry("india");
		
		EmpAddress address1= new EmpAddress(); 
		address1.setEmp(emp);
		address1.setCity("noida2");
		address1.setCountry("india2");
		List<EmpAddress> addList = new ArrayList<EmpAddress>();
		addList.add(address);
		addList.add(address1);
		
		emp.setAddress(addList);
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
	}
	
	@SuppressWarnings("deprecation")
	public static void  FindAllUser() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
	    CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> rootEntry = cq.from(Employee.class);
       CriteriaQuery<Employee> all = cq.select(rootEntry);
		
       TypedQuery<Employee> allQuery = session.createQuery(all);
       List<Employee> empList = allQuery.getResultList();
       System.out.println("Size of list :"+empList.size());
       session.getTransaction().commit();
		session.close();
	}
}
