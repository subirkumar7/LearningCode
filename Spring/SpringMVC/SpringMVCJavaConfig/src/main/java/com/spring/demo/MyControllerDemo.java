package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyControllerDemo {
	
	
	@RequestMapping(value="/getQuote")
	//@RequestMapping(value="/getQuote", params="name=jack")
	//@RequestMapping(value="/getQuote", headers="name")
	//@RequestMapping(value="/getQuote", headers="name=rahul")
	public String getQuotes(@RequestParam("userName") String userName, Model m) {
		
		m.addAttribute("requestedQuote","Hi Hello namaste "+userName);
		return "getQuote";
	}

}
