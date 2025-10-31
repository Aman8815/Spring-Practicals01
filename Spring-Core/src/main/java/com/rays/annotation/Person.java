package com.rays.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	private int id;
	private String Name;
	
	public int getId() {
		return id;
	}
	
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	
	@Value("Aman")
	public void setName(String name) {
		Name = name;
	}

}
