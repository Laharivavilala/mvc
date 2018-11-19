package com.cg.ctrl;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {
	
	ArrayList<String> cityList;
	ArrayList<String> skillList;

	@RequestMapping(value = "/showLogin")
	public String prepareLogin(Model model) {
		System.out.println("In prepareLogin()..");
		model.addAttribute("login", new Login());
		return "login";
	}

	@RequestMapping(value = "/checkLogin")
	public String checkLogin() {
		// Login to validate userName and password against database
		return "loginSuccess";
	}
	@RequestMapping(value="/showRegister")
	public String showRegister(Model model) {
		cityList = new ArrayList<String>();
		
		cityList.add("Mumbai");
		cityList.add("Hyderabad");
		cityList.add("chennai");
		cityList.add("Banglore");
		
		skillList = new ArrayList<String>();
		
		skillList.add("java");
		skillList.add("struts");
		skillList.add("spring");
		skillList.add("hibernate");
		
		model.addAttribute("cityList",cityList);
		model.addAttribute("skillList",skillList);
		model.addAttribute("register",new User());
		return "register";
	}
	@RequestMapping(value = "/checkRegister")
	public String checkRegister(@ModelAttribute("user") @Valid User user,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			System.out.println("Errors");
			model.addAttribute("cityList",cityList);
			model.addAttribute("skillList",skillList);
			
			return "register";
		}
		else {
		model.addAttribute("user",user);
		
		return "registerSuccess";
	}

	
}
}
