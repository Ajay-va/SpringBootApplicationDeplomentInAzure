package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationDeplomentInAzureApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApplicationDeplomentInAzureApplication.class, args);
		System.out.println(" Welcome to Spring boot Application....!!! We are Deploying in Azure Portal ");
	}

}
