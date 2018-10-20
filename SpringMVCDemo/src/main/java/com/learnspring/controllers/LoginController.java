package com.learnspring.controllers;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learnspring.businessrules.EmployeeValidationRules;
import com.learnspring.model.Employee;
import com.learnspring.services.serviceImpl.LoginServiceImpl;
import com.sun.javafx.collections.MappingChange.Map;

@Controller
@RequestMapping("/") // it means that all  urls start after / will be mapped to this controller class
public class LoginController {
	
	LoginServiceImpl serviceImpl = new LoginServiceImpl();
	
	@RequestMapping("/")
	public String homePage(){
		return "index";
	}
	
	@RequestMapping("/employeeRegForm")
	public String showRegForm(){
		return "empregistration";
	}
	
	@RequestMapping("/loginForm")
	public String showLoginForm(){
		return "login";
	}
	
	/**
	 *  get url parameters url LIke : sprinvMVC/emplist/hanuman - hanuman is a parameter
	 * @param empName
	 */
	@RequestMapping("/emplist/{empName}")
	public void getParamValue(@PathVariable("empName") String empName){
		
	}
	// OR
	// get url parameters url LIke : sprinvMVC/emplist/hanuman - hanuman is a parameter
	@RequestMapping("/emplist/add/{empName}")
	public void getParamValueUsingMap(@PathVariable Map<String, String> maps){
		
	}
	
	
	/**
	 * get request parameters url LIke : your form has field studentName .
	 * @param empName
	 */
	@RequestMapping("/saveStudent")
	public void getRequestValue(@RequestParam("studentName") String stuName){
		
	}
	// OR
	// get request parameters url LIke : your form has field studentName and others.
	@RequestMapping("/emplist1")
	public void getRequestValueUsingMap(@RequestParam Map<String, String> maps){
		
	}
		
	/**
	 * ModelAttrubute @ Method Level 
	 * first call to this method then corresponding handler mthod
	 * If we are adding MA annotation @ method level then it will call every time if any method of controller will call.
	 * use: to provide common data to all methods : like more methods return same heading 
	 *  
	 */
	
	@ModelAttribute
	public void addCommonData(Model model){
		model.addAttribute("headerMsg","Spring MVC Application ");
	}
	
	
	/**
	 * Retrive Model(whole object) using ModelAttribute Annot
	 * @param emp
	 * @return
	 */
	@RequestMapping("/createEmp")
	public ModelAndView createEmployee(@ModelAttribute("emp") Employee emp){
		
		ArrayList errorList = EmployeeValidationRules.validateEmpRegForm(emp);
		if(!CollectionUtils.isEmpty(errorList)){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("errorview");
			mv.addObject("errorList",errorList);
			return mv;
		}
		
		// call service to create employee
		serviceImpl.createEmployee(emp);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registrationsuccess");
		mv.addObject(emp);
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginMsg(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result","hi this is spring application for test");
		return mv;
	}
	
	@RequestMapping("/getEmpList")
	public ModelAndView getEmployeeList(){
		return null;
	}
}
