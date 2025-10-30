package com.rays.by_constractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByConstractor {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-constractor.xml");
		
		UserService UserService = (UserService) context.getBean("UserService");
		
		UserService.testAdd();
		
	}

}
