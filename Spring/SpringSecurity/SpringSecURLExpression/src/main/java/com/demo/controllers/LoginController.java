package com.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/customlogin", method=RequestMethod.GET)
	public String login(Model m) {
		
		System.out.println("Custom login controller");
		m.addAttribute("message", "Random message");

		return "customlogin";
		
	}
	
	@RequestMapping(value="/customloginfail", method=RequestMethod.GET)
	public String loginFail(Model m) {
		
		System.out.println("Custom login failed");
		m.addAttribute("error", "Failed to login");
		
		return "customlogin";
		
	}

	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(Model m) {
		
		System.out.println("Custom logout");
		m.addAttribute("message", "Log out successfully");
		
		return "customlogin";
		
	}
	
	@RequestMapping(value="/addFood", method=RequestMethod.GET)
	public String addFood(Model m) {
		
		System.out.println("Custom addFood");
		m.addAttribute("message", "Added food");
		
		return "addfood";
		
	}
	
	@PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping(value="/editFood", method=RequestMethod.GET)
	public String editFood(Model m) {
		
		System.out.println("Custom edit");
		m.addAttribute("message", "edit food");
		
		return "editfood";
		
	}

}
