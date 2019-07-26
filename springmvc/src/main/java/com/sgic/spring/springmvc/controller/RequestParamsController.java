package com.sgic.spring.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class RequestParamsController {
	
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("sal") double salary ) {
		
		System.out.println("Id" + id);
		System.out.println("Name"+name);
		System.out.println("Salary"+salary);
		
		return new ModelAndView("userReg");
	}

}
