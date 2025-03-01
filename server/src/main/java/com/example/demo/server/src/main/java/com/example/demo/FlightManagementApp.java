/*
	By: Cameron Beanland
	Date: Feb. 28th, 2025

	Project: one of two separate programs used for the sprint, this one is a server program that implements an API
			 accessible via HTTP
*/

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementApp.class, args);
	}

}
