package com.springcore.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springcore.services.Activity;

public class Integrator {
	
	@Autowired
	@Qualifier("doc")
	private Activity x;
	@Autowired 
	@Qualifier("pack")
	private Activity y;
	
	{
		System.out.println("Integrator Instantiated");
		
		
	}

	public void job() {
		x.perform();
		y.perform();
	}
}
