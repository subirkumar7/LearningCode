package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyDemoController {
	
	private String [] quotes = {"To be or not to be", "Hello Java", "Hello Spring"};
	
	
	//springMVCDemo/getQuote.html
	@RequestMapping(value="/getQuote")
	public String getRandomQuote(Model model) {
		int rand = new Random().nextInt(quotes.length);
		String randomQuote = quotes[rand];
		model.addAttribute("randomQuote", randomQuote);
		
		return "quote"; //View name
	}
	
	@ModelAttribute
	public void setUserDetails(@RequestParam("userName") String userName, Model m) {
		
		m.addAttribute("userName", userName);
		
		String userRole = "undefiend";
		
		if(userName.equals("Andy")) {
			userRole = "Student";
		} else if(userName.equals("subir")) {
			userRole = "Teacher";
		}
		
		m.addAttribute("userRole", userRole);

	}

}
