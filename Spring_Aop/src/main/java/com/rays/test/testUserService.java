package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;
@Component("testUserService")
public class testUserService {
	 @Autowired
	private UserServiceInt service;
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Application_Context.xml");
		
		  testUserService user = (testUserService) context.getBean("testUserService");
		  
		  user.testadd();
		
	}
	private void testadd() {
		
		UserDTO dto = new UserDTO();
		dto.setFirstName("ashutosh");
		dto.setLastName("sharma");
		dto.setLogin("ashutosh@gmail.com");
		dto.setPassword("ashutosh123");
	int pk =	(int) service.add(dto);
		System.out.println("DAta inseart successfully"+pk);
	}
}
