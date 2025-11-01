package com.rays.inheritancewithannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Parent")
	public void setName(String name) {
		this.name = name;
	}
	
	

}
