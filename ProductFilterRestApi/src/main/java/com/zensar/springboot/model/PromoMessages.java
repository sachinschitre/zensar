package com.zensar.springboot.model;

public class PromoMessages{
	  private String priceMatched; 
	  private String offer; 
	  private String customPromotionalMessage; 
	  private String bundleHeadline; 
	  private CustomSpecialOffer customSpecialOffer; 

	  public String getPriceMatched(){
	  	return priceMatched; 
	  }
	  public void setPriceMatched(String input){
	  	 this.priceMatched = input;
	  }
	  public String getOffer(){
	  	return offer; 
	  }
	  public void setOffer(String input){
	  	 this.offer = input;
	  }
	  public String getCustomPromotionalMessage(){
	  	return customPromotionalMessage; 
	  }
	  public void setCustomPromotionalMessage(String input){
	  	 this.customPromotionalMessage = input;
	  }
	  public String getBundleHeadline(){
	  	return bundleHeadline; 
	  }
	  public void setBundleHeadline(String input){
	  	 this.bundleHeadline = input;
	  }
	  public CustomSpecialOffer getCustomSpecialOffer(){
	  	return customSpecialOffer; 
	  }
	  public void setCustomSpecialOffer(CustomSpecialOffer input){
	  	 this.customSpecialOffer = input;
	  }
}
