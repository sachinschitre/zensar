package com.zensar.springboot;
 
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.zensar.springboot.model.Product;
import com.zensar.springboot.model.Products;


public class ProductFilterRestTestClient {
 
    public static final String REST_SERVICE_URI = "http://localhost:8080/ProductFilterRestApi/api";
     
    /* GET */
    private static void listAllProducts(){
        System.out.println("Testing listAllProducts API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        Product productsList = restTemplate.getForObject(REST_SERVICE_URI+"/product/all/", Product.class);
        List<Products> prds=productsList.getProducts();
        if(productsList!=null){
            for(Products product : prds){
               System.out.println("Product : id="+product.getProductId()+",  PriceLabel="+product.getPriceLabel()+", NowPrice="+product.getPrice().getNow());
            }
        }
    }
     
    /* GET */
    private static void getFilteredProducts(){
       
    }
     
    
 
   
 
    public static void main(String args[]){
    	
    	listAllProducts();
        getFilteredProducts();
    }
}