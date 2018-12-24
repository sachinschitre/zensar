package com.zensar.springboot.service;


import java.util.List;
import com.zensar.springboot.model.Product;
import com.zensar.springboot.model.Products;

public interface ProductFilterService {
	
	List<Products> allProducts(Product product);
	
	List<Products>  priceReducedProducts(Product product, String labelType);
	
}