package com.springcore.services;

import org.springframework.stereotype.Component;

@Component
public class Documenting implements Activity{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Performing Documentation");
	}

}
