package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.vehicles.Car;

public class AppMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		Car myCar = ac.getBean("car",Car.class);
		
		try {
		myCar.drive();
		}catch(Exception e ) {
			System.out.println("message:"+e);
		}
		
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
