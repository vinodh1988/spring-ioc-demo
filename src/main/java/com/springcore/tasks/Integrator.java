package com.springcore.tasks;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.services.Activity;

public class Integrator {
	
	@Autowired
	private Activity activity;
	
	{
		System.out.println("Integrator Instantiated");
		
		
	}

	public void job() {
		activity.perform();
	}
}
