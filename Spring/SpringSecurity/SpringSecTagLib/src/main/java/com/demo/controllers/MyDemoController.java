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
	public String getRandomQuote() {
		
		
		return "quote"; //View name
	}
	
	
}
