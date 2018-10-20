package com.learnspring.businessrules;

import java.util.ArrayList;

import org.springframework.util.StringUtils;

import com.learnspring.model.Employee;


public class EmployeeValidationRules {
	public static ArrayList validateEmpRegForm(Employee emp){
		ArrayList errorList = new ArrayList();
		if(StringUtils.isEmpty(emp.getUserName())){
			errorList.add("UserName can not be blank");
		}
		
		if(StringUtils.isEmpty(emp.getPassword())){
			errorList.add("password can not be blank");
		}
		
		return errorList;
	}
}
