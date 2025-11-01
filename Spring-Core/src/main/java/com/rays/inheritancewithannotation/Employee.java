package com.rays.inheritancewithannotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Employee")
public class Employee  extends Person{
	@PostConstruct
	public void intialize() {
		System.out.println("Bean has Created");
	}
 
	
	@Override
	@Value("2")
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	@Override
	@Value("Child")
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
}
