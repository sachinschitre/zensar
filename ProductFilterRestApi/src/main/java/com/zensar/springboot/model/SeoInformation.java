package com.zensar.springboot.model;

public class SeoInformation{
	  private String title; 
	  private String description; 

	  public String getTitle(){
	  	return title; 
	  }
	  public void setTitle(String input){
	  	 this.title = input;
	  }
	  public String getDescription(){
	  	return description; 
	  }
	  public void setDescription(String input){
	  	 this.description = input;
	  }
}