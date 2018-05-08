package com.demo.vehicles;

public class Car {

	public void drive() throws Exception {
		System.out.println("Accelarating and moving without any args");
		return ;
	}

	public void drive(int speed) throws Exception {
		String result = "";
		Boolean canDrive = true;

		if (canDrive) {
			result = "Allowed driving";
			System.out.println("Speed:" + speed);

		} else {
			result = "No GAS";
			System.out.println("No GAS");
			throw new RuntimeException("NO_GAS");
		}
		System.out.println("Accelarating and moving:" + result);
		return;
	}

	public String drive(String shout) throws Exception {
		System.out.println("Car started to move driver is shouting" );
		return "Car started to move driver is shouting" ;
	}

	public void drift() throws Exception {
		System.out.println("The car is about to drift");
		return;
	}

	public String stop() {
		System.out.println("Braking to stop");
		return "Braking to stop";
	}

}
