package com.policymicroservice.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {

		SpringApplication.run(MainApp.class, args);
		System.out.println("The application is running under tomcat server");
	}
}