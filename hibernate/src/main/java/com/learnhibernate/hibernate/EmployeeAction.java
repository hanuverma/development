package com.learnhibernate.hibernate;

import org.hibernate.Session;

public class EmployeeAction {
	
	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		
		/*Employee emp = new Employee();
		emp.setUserName("userName1");
		emp.setPassword("password1");
		
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();*/
		
		Employee emp = session.load(Employee.class, 2);
		//Employee emp = session.get(Employee.class, 2);
		System.out.println(emp.getUserName());
		System.out.println(emp.getPassword());
		
		HibernateUtils.shutdown();
		
	}
}
