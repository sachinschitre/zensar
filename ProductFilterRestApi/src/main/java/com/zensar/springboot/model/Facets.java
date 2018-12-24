package com.zensar.springboot.model;

import java.util.List;

public class Facets{
	  private String dimensionName; 
	  private String name; 
	  private String type; 
	  private String tooltip; 
	  private List<Details> details; 

	  public String getDimensionName(){
	  	return dimensionName; 
	  }
	  public void setDimensionName(String input){
	  	 this.dimensionName = input;
	  }
	  public String getName(){
	  	return name; 
	  }
	  public void setName(String input){
	  	 this.name = input;
	  }
	  public String getType(){
	  	return type; 
	  }
	  public void setType(String input){
	  	 this.type = input;
	  }
	  public String getTooltip(){
	  	return tooltip; 
	  }
	  public void setTooltip(String input){
	  	 this.tooltip = input;
	  }
	  public List<Details> getDetails(){
	  	return details; 
	  }
	  public void setDetails(List<Details> input){
	  	 this.details = input;
	  }
}