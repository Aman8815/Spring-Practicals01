package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.Appconfig;
import com.rays.Dto.EmployeeDTO;
import com.rays.service.EmployeeSeriveImp;
import com.rays.service.EmployeeServiceInt;
import com.sun.source.tree.NewClassTree;

@Component("EmployeeService")
public class TestEmployeeService {
	@Autowired
	private EmployeeServiceInt service;
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application_Context.xml");
		
		TestEmployeeService emp = (TestEmployeeService) context.getBean("EmployeeService");
		
		emp.testadd();
	}
	
	public void testadd() {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(2);
		dto.setFirstName("Aman");
		dto.setLastName("yashona");
		dto.setLogin("aman@gmail.com");
		dto.setPassword("aman123");
		int l = (int) service.add(dto);
		System.out.println("data add "+l);
	}

}
