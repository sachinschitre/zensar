package com.zensar.springboot.model;

public class Details{
	  private String facetId; 
	  private String label; 
	  private String qty; 
	  private String color; 
	  private String colorSwatchUrl; 
	  private String isSelected; 
	  private String seoUrlParts; 

	  public String getFacetId(){
	  	return facetId; 
	  }
	  public void setFacetId(String input){
	  	 this.facetId = input;
	  }
	  public String getLabel(){
	  	return label; 
	  }
	  public void setLabel(String input){
	  	 this.label = input;
	  }
	  public String getQty(){
	  	return qty; 
	  }
	  public void setQty(String input){
	  	 this.qty = input;
	  }
	  public String getColor(){
	  	return color; 
	  }
	  public void setColor(String input){
	  	 this.color = input;
	  }
	  public String getColorSwatchUrl(){
	  	return colorSwatchUrl; 
	  }
	  public void setColorSwatchUrl(String input){
	  	 this.colorSwatchUrl = input;
	  }
	  public String getIsSelected(){
	  	return isSelected; 
	  }
	  public void setIsSelected(String input){
	  	 this.isSelected = input;
	  }
	  public String getSeoUrlParts(){
	  	return seoUrlParts; 
	  }
	  public void setSeoUrlParts(String input){
	  	 this.seoUrlParts = input;
	  }
}
