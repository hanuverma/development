package com.learnspring.services.serviceImpl;

import com.learnspring.dao.daoImpl.LoginDAOImpl;
import com.learnspring.model.Employee;
import com.learnspring.model.Student;
import com.learnspring.services.LoginService;

public class LoginServiceImpl implements LoginService {
	LoginDAOImpl daoImpl = new LoginDAOImpl();
	
	public void createEmployee(Employee emp) {
		
		// connect with dao to persist emp object in DBs
		daoImpl.createEmployee(emp);
	}

	public void getEmployeeList() {
	}

	public void saveStudentDetails(Student stu) {
		daoImpl.saveStudentDetails(stu);
	}

}
