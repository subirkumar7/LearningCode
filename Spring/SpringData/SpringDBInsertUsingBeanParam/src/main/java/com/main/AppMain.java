package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.FoodGroup;
import com.demo.model.FoodGroupDAO;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		FoodGroupDAO myFoodGroupDAO = ac.getBean("foodGroupDAO", FoodGroupDAO.class);
		
		FoodGroup a1 = myFoodGroupDAO.getFoodGroups(2);
		System.out.println(a1.talkAboutYourself());

		FoodGroup a2 = myFoodGroupDAO.getFoodGroups(3);
		System.out.println(a2.talkAboutYourself());
		
	    myFoodGroupDAO.createFoodGroup(new FoodGroup("MyNewGroup","I am new food group"));
	
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
