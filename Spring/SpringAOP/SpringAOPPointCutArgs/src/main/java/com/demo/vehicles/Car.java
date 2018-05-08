package com.demo.vehicles;

public class Car {
	
	public void drive() {
		System.out.println("drive no arg constructor");
	}
	public int drive(int speed) {
		System.out.println("Accelarating and moving at speed: " +speed);
		return speed;
	}
	
	public int drive(int min_speed, int max_speed) {
		System.out.println("Drive Speed Min: " +min_speed+" Max Speed:"+max_speed);
		return max_speed;
	}
	
	public String drive(String shoutOutLoud) {
		System.out.println("Driver is shouting:"+shoutOutLoud);
		return shoutOutLoud;
	}

	
}
