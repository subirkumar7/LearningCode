package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.demo.model.FoodGroup;
import com.demo.model.FoodGroupDAO;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac = new FileSystemXmlApplicationContext("appContext.xml");
		FoodGroupDAO myFoodGroupDAO = ac.getBean("foodGroupDAO", FoodGroupDAO.class);
		
		try {
		List<FoodGroup> myFoodGroupList = myFoodGroupDAO.getFoodGroups();
		
		for(FoodGroup fg: myFoodGroupList) {
			System.out.println(fg.talkAboutYourself());
		}
		}catch(DataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
