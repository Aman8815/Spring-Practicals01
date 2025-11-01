package com.rays.collaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
	
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("collactionset.xml");
		
		MyBean1 bean = (MyBean1) context.getBean("MyBean1");
		
		bean.DisplayData();
	}

}
