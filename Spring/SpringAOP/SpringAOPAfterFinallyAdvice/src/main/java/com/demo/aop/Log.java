package com.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("execution(String com.demo.vehicles.Car.drive())")
	
	//@AfterReturning(pointcut="execution(String com.demo.vehicles.Car.drive())", returning="ret")
	//@AfterThrowing(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	//@AfterFinally(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	@After("execution(String com.demo.vehicles.Car.drive())")
	public void vehicleAboutToMove() throws Exception {
		
		Boolean flag = true;
		if(flag) {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move :");
		} else {
			throw new RuntimeException("Exception - Driving");
		}
	}

}
