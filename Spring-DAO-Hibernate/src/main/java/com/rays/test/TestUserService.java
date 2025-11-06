package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.serivce.UserServiceImpl;
import com.rays.serivce.UserServiceInt;

@Component("TestUserService")
public class TestUserService {
	@Autowired
	private UserServiceInt Service;
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		TestUserService user= (TestUserService) context.getBean("TestUserService");
		
		//user.testadd();
		//user.testupdate();
		user.testdelete();
	}
	public void testadd() {
		
		UserDTO dto = new UserDTO();
		dto.setFirstName("amit");
		dto.setLastName("yashona");
		dto.setLogin("aman@gmail.com");
		dto.setPassword("aman123");
		long pk = Service.add(dto);
		System.out.println("Data Inserted  =>"+pk);
	}
	
	public void testupdate() {
		UserDTO dto = new UserDTO();
		dto.setId(3);
		dto.setFirstName("aman");
		dto.setLastName("yashona");
		dto.setLogin("aman@gmail.com");
		dto.setPassword("aman123");
		 Service.update(dto);
		
	}
	public void testdelete() {
		UserDTO dto = new UserDTO();
		dto.setId(3);
		Service.delete(dto);
	}

}
