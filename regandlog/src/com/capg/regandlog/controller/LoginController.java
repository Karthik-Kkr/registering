package com.capg.regandlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.regandlog.model.RegAndLog;
import com.capg.regandlog.service.ILoginService;

@Controller
public class LoginController {

	@Autowired
	ILoginService loginService;
	
	@RequestMapping("/loginpage")
	public String loginPage(){
		return "login";
	}
	
	@GetMapping("/finduser")
	public ModelAndView getUser(@RequestParam("userId") int userId, 
									@RequestParam("password") String password) {
		
		String message="";
		RegAndLog rl=new RegAndLog();
		rl.setUserId(userId);
		rl.setPassword(password);
		boolean flag=loginService.login(rl);
		if(flag) {
			message="Login is successful";
		}

		else {
			message="Login is unsuccessful.....please check your credentials";
		}
		ModelAndView mv=new ModelAndView("show", "message", message);
		return mv;
	}
}
