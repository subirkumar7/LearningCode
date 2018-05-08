package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.config.appConfig;
import com.demo.vehicles.Car;

public class AppMain {
	
	public static void main(String [] args) {
		
		//ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(appConfig.class);
		Car myCar = ac.getBean("car",Car.class);
		
		myCar.drive();
		
		
		((AnnotationConfigApplicationContext)ac).close();
		
	}

}
