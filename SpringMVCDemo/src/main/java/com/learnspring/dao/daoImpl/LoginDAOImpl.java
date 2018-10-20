package com.learnspring.dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learnspring.dao.LoginDAO;
import com.learnspring.hibernateUtils.HibernateUtils;
import com.learnspring.model.Address;
import com.learnspring.model.Employee;
import com.learnspring.model.Student;

public class LoginDAOImpl implements LoginDAO{

	public void createEmployee(Employee emp) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(emp);
		System.out.println("successfully saved in db");
		tx.commit();
		session.close();
	}

	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveStudentDetails(Student stu) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		List<Address> addressList = new ArrayList<Address>();
		addressList = stu.getAddress();
		
		Address ad1=new Address();
		ad1.setAdd_city("agra");
		ad1.setState("UP");
		
		Address ad2=new Address();
		ad2.setAdd_city("lko");
		ad1.setState("UP");
		
		
		addressList.add(ad1);
		addressList.add(ad2);
		stu.setAddress(addressList);
		
		session.save(stu);
		System.out.println("student successfully saved in db");
		tx.commit();
		session.close();
	}

}
