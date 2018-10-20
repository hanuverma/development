package com.learnspring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learnspring.model.Address;
import com.learnspring.model.Student;
import com.learnspring.services.serviceImpl.LoginServiceImpl;

@Controller
public class StudentController {

	LoginServiceImpl serviceImpl = new LoginServiceImpl();
	
	@RequestMapping("/studentReg")
	public String showStudentForm(){
		return "studentForm";
	}
	
	@ModelAttribute
	public void populateListOfCourse(Model model){
		List<String> courseList = new ArrayList();
		courseList.add("B.tech");
		courseList.add("M.tech");
		courseList.add("PHD");
		courseList.add("Poly");
		courseList.add("Civil");
		model.addAttribute("courseList",courseList); 
	}
	
	@RequestMapping("/saveStudentDetails")
	public ModelAndView saveStudentDetails(@ModelAttribute("student") Student stu,BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView modelView = new ModelAndView("studentForm");
			return modelView;
		}
		
		ModelAndView modelView = new ModelAndView("showstudentdetails");
		serviceImpl.saveStudentDetails(stu);
		return modelView;
	}
	
}
