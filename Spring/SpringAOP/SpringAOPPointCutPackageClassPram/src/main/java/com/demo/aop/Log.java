package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	
	//@Before("execution(* *(..))")
	//@Before("execution(* com.demo.vehicles.Car.*(..))")
	
	@Before("within(com.demo.vehicles..*)")
	public void vehicleAboutToMove(JoinPoint jp) throws Throwable {	
		System.out.println("----------------------------------------");
		System.out.println("Execting before AOP");

		System.out.println("Current Join Point:"+jp.getStaticPart());
		return;
	}
}
