package com.rays.ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrder2 {
	
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("aman2.xml");
		
		Order2 a=  (Order2) context.getBean("order2");
		
		a.bookAcar(4);
	}

}
