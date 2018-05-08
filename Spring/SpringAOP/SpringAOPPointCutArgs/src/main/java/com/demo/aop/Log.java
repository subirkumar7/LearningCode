package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("args()") //Zero Args
	//@Before("args(..)") //any args
	//@Before("args(String)") //one args string
	//@Before("args(int)") //one args int
	//@Before("args(Integer)") //one args int and Integer matched
	//@Before("args(int, int)") //one args int and int matched
	//@Before("args(int, *)") //one args int and second arg any
	//@Before("args(*)") //one args any
	@Before("args(var1, var2)") //one args any
	public void vehicleAboutToMove(JoinPoint jp, int var1, int var2) {
		System.out.println("Saving to log (aspect class): Vehicle action: About to move");
		System.out.println("var1 "+var1+" var2 "+ var2);
	
		System.out.println("JoinPoint  :"+jp.getStaticPart());
	}

}
