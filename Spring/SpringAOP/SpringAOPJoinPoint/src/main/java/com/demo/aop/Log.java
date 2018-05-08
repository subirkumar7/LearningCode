package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	@Before("execution(void com.demo.vehicles.Car.drive(..))")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move");
		
		System.out.println("getKind :"+jp.getKind());
		System.out.println("getStaticPart :"+jp.getStaticPart());
		System.out.println("getStaticPart :"+jp.getTarget());
		
		Object [] args = jp.getArgs();
		Integer speed = ((Integer)args[0]).intValue();
		System.out.println("JoinPoint Speed :"+speed);
	}

}
