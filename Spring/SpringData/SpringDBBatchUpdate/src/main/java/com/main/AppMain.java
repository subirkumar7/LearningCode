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
		
		//FoodGroup a1 = myFoodGroupDAO.getFoodGroups(2);
		//System.out.println(a1.talkAboutYourself());

		//myFoodGroupDAO.updateFoodGroup(new FoodGroup(6, "Fruit", "My Fruit"));
		
		//myFoodGroupDAO.deleteFoodGroups(6);
		//System.out.println(a1.talkAboutYourself());

		FoodGroup a = new FoodGroup("A1","New fruit");
		FoodGroup b = new FoodGroup("A2","New Veg");
		FoodGroup c = new FoodGroup("A3","New Meat");

		FoodGroup d = new FoodGroup("A1","New Meat");
		
		List<FoodGroup> fgList= new ArrayList<FoodGroup>();
		fgList.add(a);
		fgList.add(b);
		fgList.add(c);
		fgList.add(d);
		
		int[] count = myFoodGroupDAO.batchUpdateFoodGroup(fgList);
		
		for(int x: count) {
			System.out.println(" Updated row:"+x);
			
		}
	   // myFoodGroupDAO.createFoodGroup(new FoodGroup("MyNewGroup","I am new food group"));
	
		((FileSystemXmlApplicationContext)ac).close();
		
	}

}
