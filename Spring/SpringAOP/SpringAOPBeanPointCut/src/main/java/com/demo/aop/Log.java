package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("bean(car)")
	@Before("bean(myDemo*)")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move");
	
		System.out.println("JoinPoint  :"+jp.getStaticPart());
	}

}
