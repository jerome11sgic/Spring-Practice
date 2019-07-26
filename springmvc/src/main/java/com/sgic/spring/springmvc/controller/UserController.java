package com.sgic.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.spring.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
		
	}

	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView =new ModelAndView();
		
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regResult");
		return modelAndView;	
	}
}
