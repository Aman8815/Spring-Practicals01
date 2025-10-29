package com.rays.lifecycle;

public class MyBean1 {
	
	public void init() {
		System.out.println("init Method : Bean Created");
	}
	
	public void service() {
		System.out.println("Service Method : Called MAnually");
	} 
	
	public void destroy() {
		System.out.println("Destrooy Method : Bean Destroy");
	}

}
