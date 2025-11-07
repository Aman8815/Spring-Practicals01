package com.rays.test;

import java.util.List;

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

		TestUserService user = (TestUserService) context.getBean("TestUserService");

		// user.testadd();
		// user.testupdate();
		// user.testdelete();
		//user.testfindByPk();
		//user.findByLogin();
		//user.testauthonticate();
		user.TestSearch();
	}

	public void testadd() {

		UserDTO dto = new UserDTO();
		dto.setFirstName("amit");
		dto.setLastName("yashona");
		dto.setLogin("aman@gmail.com");
		dto.setPassword("aman123");
		long pk = Service.add(dto);
		System.out.println("Data Inserted  =>" + pk);
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

	public void testfindByPk() {
		UserDTO dto = null;
		long pk = 6;
		dto = Service.findBypk(pk);

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("User Not Found");
		}
	}

	public void findByLogin() {
		UserDTO dto = null;
		String login = "aman@gmail.com";
		dto = Service.findByLogin(login);

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("User Not Found");
		}
	}
	
	public void testauthonticate() {
		String login = "aman@gmail.com";
		String password = "aman123";
		UserDTO dto = Service.authanticate(login, password);
		
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("User Not Found");
		}
	}
	
	public void TestSearch() {
		 
		int pageNo = 1;
		int pageSize = 5;
		
		UserDTO dto = null;
		
		List<UserDTO> list = Service.search(dto, pageNo, pageSize);
		
		for(UserDTO udto:list) {
			System.out.print(udto.getId()+"  ");
			System.out.print(udto.getFirstName()+"  ");
			System.out.print(udto.getLastName()+"  ");
			System.out.print(udto.getLogin()+"  ");
			System.out.print(udto.getPassword());
			System.out.println();
			
		}
	}

}
