package com.zensar.springboot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@JsonDeserialize(using = ProductsDeserialiser.class)

public class Product{
	  private String showInStockOnly; 
	  private List<Products> products; 
	  private List<Facets> facets; 
	  private String categoryTitle; 
	  private int childCategoriesCount; 
	  private SeoInformation seoInformation; 
	  private int results; 
	  private int pagesAvailable; 
	  private List<Crumbs> crumbs; 
	  private String dynamicBannerId; 
	  private String seoBannerId; 
	  private String redirectUrl; 
	  private List<StaticLinks> staticLinks; 
	  private String selectedDept; 
	  private String multiCatSelected; 
	  private String endecaCanonical; 

	  public String getShowInStockOnly(){
	  	return showInStockOnly; 
	  }
	  public void setShowInStockOnly(String input){
	  	 this.showInStockOnly = input;
	  }
	  public List<Products> getProducts(){
	  	return products; 
	  }
	  public void setProducts(List<Products> input){
	  	 this.products = input;
	  }
	  public List<Facets> getFacets(){
	  	return facets; 
	  }
	  public void setFacets(List<Facets> input){
	  	 this.facets = input;
	  }
	  public String getCategoryTitle(){
	  	return categoryTitle; 
	  }
	  public void setCategoryTitle(String input){
	  	 this.categoryTitle = input;
	  }
	  public int getChildCategoriesCount(){
	  	return childCategoriesCount; 
	  }
	  public void setChildCategoriesCount(int input){
	  	 this.childCategoriesCount = input;
	  }
	  public SeoInformation getSeoInformation(){
	  	return seoInformation; 
	  }
	  public void setSeoInformation(SeoInformation input){
	  	 this.seoInformation = input;
	  }
	  public int getResults(){
	  	return results; 
	  }
	  public void setResults(int input){
	  	 this.results = input;
	  }
	  public int getPagesAvailable(){
	  	return pagesAvailable; 
	  }
	  public void setPagesAvailable(int input){
	  	 this.pagesAvailable = input;
	  }
	  public List<Crumbs> getCrumbs(){
	  	return crumbs; 
	  }
	  public void setCrumbs(List<Crumbs> input){
	  	 this.crumbs = input;
	  }
	  public String getDynamicBannerId(){
	  	return dynamicBannerId; 
	  }
	  public void setDynamicBannerId(String input){
	  	 this.dynamicBannerId = input;
	  }
	  public String getSeoBannerId(){
	  	return seoBannerId; 
	  }
	  public void setSeoBannerId(String input){
	  	 this.seoBannerId = input;
	  }
	  public String getRedirectUrl(){
	  	return redirectUrl; 
	  }
	  public void setRedirectUrl(String input){
	  	 this.redirectUrl = input;
	  }
	  public List<StaticLinks> getStaticLinks(){
	  	return staticLinks; 
	  }
	  public void setStaticLinks(List<StaticLinks> input){
	  	 this.staticLinks = input;
	  }
	  public String getSelectedDept(){
	  	return selectedDept; 
	  }
	  public void setSelectedDept(String input){
	  	 this.selectedDept = input;
	  }
	  public String getMultiCatSelected(){
	  	return multiCatSelected; 
	  }
	  public void setMultiCatSelected(String input){
	  	 this.multiCatSelected = input;
	  }
	  public String getEndecaCanonical(){
	  	return endecaCanonical; 
	  }
	  public void setEndecaCanonical(String input){
	  	 this.endecaCanonical = input;
	  }
}  