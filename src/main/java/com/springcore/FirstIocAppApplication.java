package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class FirstIocAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstIocAppApplication.class, args);
		System.out.println("App started and Running");
	}

}
