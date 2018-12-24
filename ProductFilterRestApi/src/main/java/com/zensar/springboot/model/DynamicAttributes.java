package com.zensar.springboot.model;

public class DynamicAttributes{
	  private String newinproducttype; 
	  private String washinginstructions; 
	  private String dressbyoccasion; 
	  private String dressshape; 
	  private String typeofpattern; 

	  public String getNewinproducttype(){
	  	return newinproducttype; 
	  }
	  public void setNewinproducttype(String input){
	  	 this.newinproducttype = input;
	  }
	  public String getWashinginstructions(){
	  	return washinginstructions; 
	  }
	  public void setWashinginstructions(String input){
	  	 this.washinginstructions = input;
	  }
	  public String getDressbyoccasion(){
	  	return dressbyoccasion; 
	  }
	  public void setDressbyoccasion(String input){
	  	 this.dressbyoccasion = input;
	  }
	  public String getDressshape(){
	  	return dressshape; 
	  }
	  public void setDressshape(String input){
	  	 this.dressshape = input;
	  }
	  public String getTypeofpattern(){
	  	return typeofpattern; 
	  }
	  public void setTypeofpattern(String input){
	  	 this.typeofpattern = input;
	  }
}