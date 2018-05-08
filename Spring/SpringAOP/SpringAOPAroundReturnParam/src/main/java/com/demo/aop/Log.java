package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("execution(String com.demo.vehicles.Car.drive())")
	
	//@AfterReturning(pointcut="execution(String com.demo.vehicles.Car.drive())", returning="ret")
	//@AfterThrowing(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	//@AfterFinally(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	//@After("execution(String com.demo.vehicles.Car.drive())")
	@Around("execution(String com.demo.vehicles.Car.drive(..))")
	public String vehicleAboutToMove(ProceedingJoinPoint pjp) throws Throwable {
		
		String returnString = "";
		Object[] callerArgs = pjp.getArgs();
		int speed = ((Integer)(callerArgs[0])).intValue();
		
		if(speed>=50) speed = 50;
		
		Object[] newArgs= new Object[1];
		newArgs[0] = new Integer(speed);
		
		System.out.println("Saving to log (aspect class): before action");
		Object returnObj= pjp.proceed(newArgs);

		returnString = "Altered string :"+returnObj.toString();
		
		System.out.println("Saving to log (aspect class): after action");
		return returnString;
	}

}
