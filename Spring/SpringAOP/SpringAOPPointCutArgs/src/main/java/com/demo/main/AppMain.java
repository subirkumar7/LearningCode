package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.vehicles.Car;

public class AppMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/appContext.xml");
		Car myCar = ac.getBean("car",Car.class);
		
		myCar.drive();
		myCar.drive(113);
		myCar.drive(12,34);
		myCar.drive("Hello World");
		
		
		
		((ClassPathXmlApplicationContext)ac).close();
		
	}

}
