package com.zensar.springboot.model;


public class Price{
	  private String was; 
	  private String then1; 
	  private String then2; 
	  private String now; 
	  private String uom; 
	  private String currency; 

	  public String getWas(){
	  	return was; 
	  }
	  public void setWas(String input){
	  	 this.was = input;
	  }
	  public String getThen1(){
	  	return then1; 
	  }
	  public void setThen1(String input){
	  	 this.then1 = input;
	  }
	  public String getThen2(){
	  	return then2; 
	  }
	  public void setThen2(String input){
	  	 this.then2 = input;
	  }
	  public String getNow(){
	  	return now; 
	  }
	  public void setNow(String input){
	  	 this.now = input;
	  }
	  public String getUom(){
	  	return uom; 
	  }
	  public void setUom(String input){
	  	 this.uom = input;
	  }
	  public String getCurrency(){
	  	return currency; 
	  }
	  public void setCurrency(String input){
	  	 this.currency = input;
	  }
}

  