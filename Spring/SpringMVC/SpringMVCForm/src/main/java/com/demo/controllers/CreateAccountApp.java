package com.demo.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.model.Account;

@Controller
@SessionAttributes("aNewAccount")
public class CreateAccountApp {
	
	@ModelAttribute
	public void addAccountToModel(Model model) {
		
		System.out.println("Make sure account object is there in model");
		
		if(!model.containsAttribute("aNewAccount")) {
			Account a = new Account();
			model.addAttribute("aNewAccount", a);
			
		}
		
	}
	@RequestMapping(value="/createAccount")
	public String createAccount(@ModelAttribute("aNewAccount") Account account) {
		
	System.out.println("Form validation success");
	return "createAccount";
		
	}
	
	
	@RequestMapping(value="/accountCreated", method=RequestMethod.POST)
	public String creationPerformed(@Valid @ModelAttribute("aNewAccount") Account account, BindingResult result) {
		
		if(result.hasErrors()){
			
			System.out.println("Form has error");
			return "createAccount";
			
		}	
		
		System.out.println(account.getFirstName());
		System.out.println(account.getLastName());
		System.out.println(account.getAge());
		System.out.println(account.getAddress());
		System.out.println(account.getEmail());
		
		
		return "redirect:accountConfirm";
	}
	
	@RequestMapping(value="/accountConfirm", method=RequestMethod.GET)
	public String creationConfirm(@Valid @ModelAttribute("aNewAccount") Account account, BindingResult result) {
		
		System.out.println("-----------------");

		System.out.println(account.getFirstName());
		System.out.println(account.getLastName());
		System.out.println(account.getAge());
		System.out.println(account.getAddress());
		System.out.println(account.getEmail());
		System.out.println("-----------------");
		
		return "accountCreated";
	}
	
	
	//Add cookie
	
	@RequestMapping(value="/addCookie")
	public String  addCookie(HttpServletResponse response) {
		response.addCookie(new Cookie("myRandomCookie", "Mycookie"));
		System.out.println("Cookie added");
		return "demoPage";
	}

	//Get Cookie
	@RequestMapping(value="/getCookie")
	public String getCookie(@CookieValue("myRandomCookie") String myCookie){	
		System.out.println("Cookie Retrieved:"+ myCookie);
		return "demoPage";
	}
	
}
