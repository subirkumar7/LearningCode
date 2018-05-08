package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.vehicles.Car;

public class AppMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		Car myCar = ac.getBean("car",Car.class);
		
		myCar.drive(113);
		
		
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
