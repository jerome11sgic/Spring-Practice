package com.sgic.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("helloo");
		
		modelAndView.addObject("id",123);
		modelAndView.addObject("name","Bharath");
		modelAndView.addObject("salary",100000);
		return modelAndView;
	}
}
