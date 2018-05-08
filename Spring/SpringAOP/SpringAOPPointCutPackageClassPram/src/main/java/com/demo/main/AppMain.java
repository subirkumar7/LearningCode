package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.aop.sports.GolfClub;
import com.demo.vehicles.Car;
import com.demo.vehicles.offroad.DirtBike;
import com.demo.vehicles.offroad.FourWheeler;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		Car myCar = ac.getBean("car", Car.class);
		DirtBike dirtBike = ac.getBean("dirtBike", DirtBike.class);
		FourWheeler fourWheeler = ac.getBean("fourWheeler", FourWheeler.class);
		GolfClub golfClub = ac.getBean("golfClub", GolfClub.class);

		try {
			
			myCar.drive();
			myCar.stop();
			
			dirtBike.drive();
			dirtBike.stop();
			
			fourWheeler.drive();
			fourWheeler.stop();
			
			golfClub.drive();
			golfClub.swing();
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("message:" + e);
		}

		((FileSystemXmlApplicationContext) ac).close();

	}

}
