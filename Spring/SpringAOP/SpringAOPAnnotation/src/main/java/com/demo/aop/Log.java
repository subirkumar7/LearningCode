package com.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	@Before("execution(void com.demo.vehicles.Car.drive())")
	public void vehicleAboutToMove() {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move");
	}

}
