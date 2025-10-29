package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle1.xml");
		
		MyBean1 bean = context.getBean("mybean1",MyBean1.class);
		
		bean.service();
		
		((ClassPathXmlApplicationContext)context).close();
		
		 
	}

}
