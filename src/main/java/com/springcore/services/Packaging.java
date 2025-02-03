package com.springcore.services;

import org.springframework.stereotype.Component;

@Component("pack")
public class Packaging implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
         System.out.println("Packaging activity");
	}

}
