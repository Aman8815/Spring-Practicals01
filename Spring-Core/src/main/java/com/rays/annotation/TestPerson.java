package com.rays.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestPerson {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p = (Person) context.getBean("person");
		
		System.out.println("ID =>"+p.getId());
		System.out.println("Name =>"+p.getName());
	}

}
