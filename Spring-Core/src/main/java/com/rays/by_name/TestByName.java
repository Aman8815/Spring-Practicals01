package com.rays.by_name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByName {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-name.xml");
		
		UserService userService = (UserService) context.getBean("UserService");
		
		userService.TestAdd();
	}

}
