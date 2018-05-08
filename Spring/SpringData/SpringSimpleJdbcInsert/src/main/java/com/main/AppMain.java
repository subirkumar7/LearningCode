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
	
			FoodGroup a = new FoodGroup("B2","New fruit");
			
			int count = myFoodGroupDAO.createSI(a);
			System.out.println(" Inserted ID:"+count);
				
		}catch(DataAccessException e) {
			System.out.println(" DataAccessException :"+e.getMessage());
		}
	   // myFoodGroupDAO.createFoodGroup(new FoodGroup("MyNewGroup","I am new food group"));
	
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
