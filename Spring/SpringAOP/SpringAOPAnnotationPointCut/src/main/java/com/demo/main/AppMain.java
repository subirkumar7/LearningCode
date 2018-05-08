package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.vehicles.Car;
import com.demo.vehicles.Coupe;

public class AppMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/appContext.xml");
		Car myCar = ac.getBean("car",Car.class);
		Coupe coupe = ac.getBean("coupe",Coupe.class);

		myCar.drive();
		myCar.drive(113);
		myCar.drive("Hello World");
		
		coupe.drive();
		
		
		
		((ClassPathXmlApplicationContext)ac).close();
		
	}

}
