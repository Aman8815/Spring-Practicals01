package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMulti {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("multi.xml");
		
		Person p = (Person) context.getBean("person");
		System.out.println("ID =>"+p.getId());
		System.out.println("Name = >"+p.getName());
		System.out.println("Address =>"+p.getAddress());
		
		Doctore d = (Doctore) context.getBean("doctore");
		System.out.println("ID =>"+d.getId());
		System.out.println("Name = >"+d.getName());
		System.out.println("Address =>"+d  	.getAddress());
	}

}
