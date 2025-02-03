package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springcore.tasks.Integrator;

@SpringBootApplication

public class FirstIocAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(FirstIocAppApplication.class, args);
		Integrator i=(Integrator)ac.getBean("integrator");
		i.job();
	
		System.out.println("App started and Running");
	}

}
