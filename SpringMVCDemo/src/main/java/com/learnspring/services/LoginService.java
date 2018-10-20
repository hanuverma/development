package com.learnspring.services;

import com.learnspring.model.Employee;
import com.learnspring.model.Student;

public interface LoginService {
	public void createEmployee(Employee emp);
	public void getEmployeeList();
	
	// student service
	public void saveStudentDetails(Student stu);
}
