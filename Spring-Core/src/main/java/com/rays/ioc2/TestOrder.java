 package com.rays.ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrder {
  public static void main(String[] args) {
	
	  ApplicationContext context = new ClassPathXmlApplicationContext("aman.xml");
	  
	  Order o = (Order) context.getBean("order");
	  
	  o.bookAcar(2);
}
}
