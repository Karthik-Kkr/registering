package com.capg.regandlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.regandlog.model.RegAndLog;
import com.capg.regandlog.service.IRegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	IRegistrationService service;
	
	@RequestMapping("/")
	public String homePage() {
		return "register";
	}
	
	@RequestMapping("/addUser")
	public ModelAndView newRegistry(@RequestParam("name") String name, @RequestParam("userId") int userId,
			@RequestParam("mobileNo") long mobileNo, @RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("confirmPassword") String confirmPassword) {
		
		String message="";
		RegAndLog reglog=new RegAndLog();
		reglog.setName(name);
		reglog.setUserId(userId);
		reglog.setMobileNo(mobileNo);
		reglog.setEmail(email);
		reglog.setPassword(password);
		reglog.setConfirmPassword(confirmPassword);	
	
		RegAndLog rl=service.newRegistry(reglog);
		
		if(rl.equals(null)) {
			message="Registration failed";
		}

		else {
			message="Registration success";
		}
		
		ModelAndView mv=new ModelAndView("success", "message", message);
		return mv;
	}
}