package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Micro1Application {

	public static void main(String[] args) {
		System.out.println("Entered");

		SpringApplication.run(Micro1Application.class, args);
	}

}
