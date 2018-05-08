package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.vehicles.Car;
import com.demo.vehicles.DirtBike;
import com.demo.vehicles.FourWheeler;

public class AppMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/appContext.xml");
		Car myCar = ac.getBean("car",Car.class);
		
		DirtBike dirtBike = ac.getBean(DirtBike.class);
		FourWheeler fourWheeler = ac.getBean(FourWheeler.class);

		
		myCar.drive();
		myCar.stop();
		
		dirtBike.drive();
		dirtBike.stop();
		
		fourWheeler.drive();
		fourWheeler.stop();
		((ClassPathXmlApplicationContext)ac).close();
		
	}

}
