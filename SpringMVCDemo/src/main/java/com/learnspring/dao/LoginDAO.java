package com.learnspring.dao;

import java.util.List;

import com.learnspring.model.Employee;
import com.learnspring.model.Student;

public interface LoginDAO {
	public void createEmployee(Employee emp);
	public List<Employee> getEmployeeList();
	
	// student dao
	public void saveStudentDetails(Student stu);
}
