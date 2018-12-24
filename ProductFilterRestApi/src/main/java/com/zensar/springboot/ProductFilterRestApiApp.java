package com.zensar.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.zensar.springboot"})
public class ProductFilterRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductFilterRestApiApp.class, args);
	}
}
