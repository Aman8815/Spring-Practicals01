package com.rays.collaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdk.nashorn.internal.runtime.Context;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		
		MyBean mybean = (MyBean) context.getBean("mybean");
		
		mybean.displayData();
		
		
	}
	
	

}
