package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.FoodGroup;
import com.demo.model.FoodGroupDAO;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		FoodGroupDAO myFoodGroupDAO = ac.getBean("foodGroupDAO", FoodGroupDAO.class);
		
		myFoodGroupDAO.demoMethod();
		
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
