package com.demo.vehicles;

import org.springframework.stereotype.Component;

@Component("myDemoFourWheeler")
public class FourWheeler {
	

public void drive() {
		
		//Meeting tracing concern
		//System.out.println("Saving the log (for Car class): Car is driving");
		
		//Actual business logic for driving
		System.out.println("FourWheeler: Accelarating and moving");
	}
	
	public void stop() {
		System.out.println("FourWheeler: Braking to stop");
	}


}
