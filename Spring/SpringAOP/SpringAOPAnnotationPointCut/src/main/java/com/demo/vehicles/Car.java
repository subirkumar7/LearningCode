package com.demo.vehicles;

import com.demo.aop.MyAnnotation;

public class Car {
	
	@MyAnnotation
	public void drive() {
		System.out.println("Car: drive no arg");
	}
	public int drive(int speed) {
		System.out.println("Car: Accelarating and moving at speed: " +speed);
		return speed;
	}
	
	public int drive(int min_speed, int max_speed) {
		System.out.println("Car:Drive Speed Min: " +min_speed+" Max Speed:"+max_speed);
		return max_speed;
	}
	
	@MyAnnotation
	public String drive(String shoutOutLoud) {
		System.out.println("Car: Driver is shouting:"+shoutOutLoud);
		return shoutOutLoud;
	}

	
}
