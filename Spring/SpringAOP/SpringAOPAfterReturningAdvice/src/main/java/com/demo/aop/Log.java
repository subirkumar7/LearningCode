package com.demo.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("execution(String com.demo.vehicles.Car.drive())")
	
	@AfterReturning(pointcut="execution(String com.demo.vehicles.Car.drive())", returning="ret")
	public void vehicleAboutToMove(String ret) throws Exception {
		
		Boolean flag = true;
		if(flag) {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move" +ret);
		} else {
			throw new RuntimeException("Exception - Driving");
		}
	}

}
