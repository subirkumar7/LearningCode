package com.demo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppDemo {
	
	public static void main(String[] args) {
		
		PasswordDemo pd = new PasswordDemo();
		pd.getMD5Hash("123456789");
		pd.getSHAHash("123456789");
		pd.getBCryptHash("123456789");
		
	}

}
