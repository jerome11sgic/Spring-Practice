package com.sgic.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.spring.springmvc.dto.Employee;

@Controller
public class ListControllor {
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("John");
		employee.setSalary(8000);
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("Raja");
		employee2.setSalary(8000);
		
		Employee employee3=new Employee();
		employee3.setId(3);
		employee3.setName("Ravi");
		employee3.setSalary(8000);
		
		ArrayList<Employee> employees =new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
	}

}
