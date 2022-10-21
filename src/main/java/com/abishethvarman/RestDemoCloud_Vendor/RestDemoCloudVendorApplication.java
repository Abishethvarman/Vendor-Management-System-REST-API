package com.abishethvarman.RestDemoCloud_Vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDemoCloudVendorApplication {

	//This is the main function and it will through a whitelabel error on port8080
	public static void main(String[] args) {
		SpringApplication.run(RestDemoCloudVendorApplication.class, args);
		System.out.println("The Spring boot application is working....");
	}
}
