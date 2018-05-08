package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("within(com.demo.vehicles.*)")
	//@Before("execution(@com.demo.aop.MyAnnotation * *(..))")
	//@Before("execution(* (@com.demo.aop.MyAnnotation *). *(..))")
	@Before("@annotation(MyAnnotation)")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("-------------------------------------");
		System.out.println("Saving to log (aspect class): Vehicle action: About to move");	
		System.out.println("JoinPoint  :"+jp.getStaticPart());
	}

}
