package com.zensar.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.springboot.model.Product;
import com.zensar.springboot.model.Products;
import com.zensar.springboot.service.ProductFilterService;

@RestController
@RequestMapping("/api")
public class ProductController {

	public static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductFilterService productFilterService; // Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All Products unfiltered
	@RequestMapping(value = "/product/all", method = RequestMethod.GET)
	public ResponseEntity<List<Products>> listAllProducts() {

		RestTemplate restTemplate = new RestTemplate();
		Product product;

		try {
			product = restTemplate.getForObject(
					"https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",
					Product.class);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			//Return empty content in case of network or other I/O issues
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);

		}
		List<Products> listProducts = productFilterService.allProducts(product);
		if (listProducts.isEmpty()) {

			// May return HttpStatus.NOT_FOUND
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);

		}

		return new ResponseEntity<List<Products>>(listProducts, HttpStatus.OK);
	}

	// -------------------Retrieve subset of products filtered by price reduction
	//Assume a default 'ShowWasNow' value for labelType[Optional], if not embedded in the GET request
	@RequestMapping(value = "/product/filtered/", method = RequestMethod.GET)
	public ResponseEntity<List<Products>> listFilteredProducts(@RequestParam Optional<String> labelType) {

		RestTemplate restTemplate = new RestTemplate();
		Product product;

		try {
			product = restTemplate.getForObject(
					"https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",
					Product.class);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			//Return empty content in case of network or other I/O issues
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);

		}

		List<Products> listProducts;
		if(labelType.isPresent())
			listProducts = productFilterService.priceReducedProducts(product, labelType.get());
		else
			listProducts = productFilterService.priceReducedProducts(product, "ShowWasNow");
		if (listProducts.isEmpty()) {

			// May return HttpStatus.NOT_FOUND
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);

		}

		return new ResponseEntity<List<Products>>(listProducts, HttpStatus.OK);
	}

}
