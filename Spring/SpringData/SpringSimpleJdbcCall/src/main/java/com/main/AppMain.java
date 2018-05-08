package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.demo.model.FoodGroup;
import com.demo.model.FoodGroupDAO;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		
		try {
		FoodGroupDAO myFoodGroupDAO = ac.getBean("foodGroupDAO", FoodGroupDAO.class);
		
		FoodGroup a = myFoodGroupDAO.readFoodGroup(1);
		System.out.println(a.getName());
		System.out.println(a.getDescription());

		
		
		if(null!=a) {
		System.out.println(a.talkAboutYourself());
		} else {
			System.out.println("a is null");
		}

	   // myFoodGroupDAO.createFoodGroup(new FoodGroup("MyNewGroup","I am new food group"));
		}catch(DataAccessException e) {
			System.out.println(e);
		}
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
