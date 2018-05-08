package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	//@Before("execution(String com.demo.vehicles.Car.drive())")
	
	//@AfterReturning(pointcut="execution(String com.demo.vehicles.Car.drive())", returning="ret")
	//@AfterThrowing(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	//@AfterFinally(pointcut="execution(String com.demo.vehicles.Car.drive())", throwing="ex")
	//@After("execution(String com.demo.vehicles.Car.drive())")
	@Before("pointCuteAllStratingWith_dr()")
	public void vehicleAboutToMove() throws Throwable {
		System.out.println("--Execting before AOP--");
		return;
	}
	
	@Pointcut("execution(* *(..))")
	public void pointCuteAllStratingWith_dr() {
		
	}
	
	@Pointcut("execution(String *(..))")
	public void pointCuteAllReturnString() {
		
	}

}
