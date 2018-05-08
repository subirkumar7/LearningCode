package com.demo.vehicles;

public class Car {
	
	public String drive(int speed) throws Exception {
		
		//Meeting tracing concern
		//System.out.println("Saving the log (for Car class): Car is driving");
		
		//Actual business logic for driving
		String result = "";
		Boolean canDrive=true;
		
		if(canDrive) {
			result="Allowed driving";
			System.out.println("Speed:"+speed);

		} else{
			result="No GAS";
			System.out.println("No GAS");
			throw new RuntimeException("NO_GAS");
		}
		System.out.println("Accelarating and moving:"+result);
		
		return result;
	}
	
	public void stop() {
		System.out.println("Braking to stop");
	}

	
}
