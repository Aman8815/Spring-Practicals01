package com.rays.no_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNoType {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-notype.xml");
		
		UserService userService = (UserService) context.getBean("UserService");
		
		userService.Testadd();
	}

}
