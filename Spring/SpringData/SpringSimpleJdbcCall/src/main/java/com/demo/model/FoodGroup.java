package com.demo.model;

public class FoodGroup {

	private int id;
	private String name;
	private String description;
	
	public FoodGroup(){}
	
	public FoodGroup(String name, String description){
		this.name = name;
		this.description=description;
		
	}
	
	public FoodGroup(int id, String name, String description){
		this.name = name;
		this.description=description;
		this.id = id;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkAboutYourself() {
		
		String answer = this.getId() +"|"+ this.getName().trim() +"|"+ this.getDescription().trim()+"|\n";
		return answer;
	}
	
	
}
