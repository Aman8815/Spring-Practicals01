package com.rays.annotationByautowire;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImp implements UserDAOInt{
	
	public void add() {
		System.out.println("ADD method");
	}

}
