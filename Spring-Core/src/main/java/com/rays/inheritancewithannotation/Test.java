package com.rays.inheritancewithannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.inheritancewithannotation.AppConfig;

public class Test {
   public static void main(String[] args) {
	
	   ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	   
	   Person person = (Person) context.getBean("person");
	   
	   System.out.println(person.getId());
	   System.out.println(person.getName());
}
}
