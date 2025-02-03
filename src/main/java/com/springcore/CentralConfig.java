package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.tasks.Integrator;

@Configuration
public class CentralConfig {
	{
		System.out.println("Central Config Instatiated");
	}
	
	@Bean("integrator")
	public Integrator getIntegrator() {
		return new Integrator();
	}
}
