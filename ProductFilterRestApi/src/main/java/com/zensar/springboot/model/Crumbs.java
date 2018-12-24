package com.zensar.springboot.model;

public class Crumbs{
	  private String type; 
	  private String displayName; 
	  private String item; 
	  private String clickable; 

	  public String getType(){
	  	return type; 
	  }
	  public void setType(String input){
	  	 this.type = input;
	  }
	  public String getDisplayName(){
	  	return displayName; 
	  }
	  public void setDisplayName(String input){
	  	 this.displayName = input;
	  }
	  public String getItem(){
	  	return item; 
	  }
	  public void setItem(String input){
	  	 this.item = input;
	  }
	  public String getClickable(){
	  	return clickable; 
	  }
	  public void setClickable(String input){
	  	 this.clickable = input;
	  }
}