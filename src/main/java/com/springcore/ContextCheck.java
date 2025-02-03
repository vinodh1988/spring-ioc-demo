package com.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ContextCheck implements ApplicationContextAware 
{
	{
		System.out.println("ContextCheck intantiated");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application Context " +applicationContext.getBeanDefinitionCount());
	}

}
