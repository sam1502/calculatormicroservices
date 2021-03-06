package com.calculatormicroservices.calculatormicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.calculatormicroservices")

public class CalculatormicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatormicroservicesApplication.class, args);
	}
}
