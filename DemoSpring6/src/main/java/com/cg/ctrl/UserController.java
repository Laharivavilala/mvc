package com.cg.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@RequestMapping(value = "showLogin")
	public String prepareLogin(Model model) {
		System.out.println("In prepareLogin()..");
		model.addAttribute("login", new Login());
		return "login";
	}

	@RequestMapping(value = "checkLogin")
	public String checkLogin() {
		// Login to validate userName and password against database
		return "loginSuccess";
	}
	@RequestMapping(value="showRegister")
	public String showRegister(Model model) {
		
		model.addAttribute("register",new User());
		return "register";
	}
	
	public String checkRegister(User user,Model model) {
		model.addAttribute("user",user);
		return "registerSuccess";
	}

	
}
