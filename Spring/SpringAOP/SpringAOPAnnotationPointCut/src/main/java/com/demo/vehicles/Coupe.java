package com.demo.vehicles;

import org.springframework.stereotype.Component;

import com.demo.aop.MyAnnotation;

@Component
//@MyAnnotation
public class Coupe {
	

	public void drive() {
		System.out.println("Coupe: drive no arg ");
	}

}
