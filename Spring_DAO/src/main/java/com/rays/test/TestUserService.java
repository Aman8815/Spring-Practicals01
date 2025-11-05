package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.Appconfig;
import com.rays.Dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("UserService")
public class TestUserService {
	@Autowired
	private UserServiceInt service = null;
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application_Context.xml");
		
		TestUserService user = (TestUserService) context.getBean("UserService");
		
		//user.testUpdate();
		//user.Testadd();
		//user.testdelete(4);
		//user.findbylogin();
		//user.authenticate();
		user.testsearch();
		
		
	}
	
	public void Testadd() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("aman");
	    dto.setLastName("yashona");
	    dto.setLogin("Aman@gmail.com");
	    dto.setPassword("aman123");
	    long pk = service.add(dto);
	    
	    System.out.println("Data Inserted =>"+pk);
	}
	
	public void testdelete(int ids) {
		int id =ids;
		service.delete(id);
	}
	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(2);
		dto.setFirstName("vishal");
	    dto.setLastName("sisodiya");
	    dto.setLogin("vishal@gmail.com");
	    dto.setPassword("vishal123");
	    service.update(dto);
		
	}
    
	public void findbylogin() {
		String login = "vishal@gmail.com";
		UserDTO dto = service.findByLogin(login);
		if(dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
		}
		
	}
	
	public void authenticate() {
		String gmail = "aman@gmail.com";
	    String password = "aman123";
	   
	    UserDTO dto = service.authenticate(gmail, password);
	    System.out.println(dto.getId());
	    System.out.println(dto.getFirstName());
	}
	
	public void testsearch() {
		
		UserDTO dto = new UserDTO();
		
		List list = service.search();
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			dto = (UserDTO) it.next();
			System.out.print(dto.getId()+"  ");
			System.out.print(dto.getFirstName()+ "   ");
			System.out.print(dto.getLastName());
			System.out.println();
		}
		
		
	}
	
}
