package com.demo.vehicles;

public class Car {
	
	public void drive(int speed) {
		
		//Meeting tracing concern
		//System.out.println("Saving the log (for Car class): Car is driving");
		
		//Actual business logic for driving
		System.out.println("Accelarating and moving at speed: " +speed);
	}
	
	public void stop() {
		System.out.println("Braking to stop");
	}

	
}
