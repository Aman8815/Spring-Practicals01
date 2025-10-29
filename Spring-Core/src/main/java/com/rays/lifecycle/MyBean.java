package com.rays.lifecycle;

public class MyBean {
	
	public void init() {
		System.out.println("Init method : Bean Created");
	}
	
	public void service() {
		System.out.println("Service Method : Create Manully");
	}
	
	public void destroy() {
		System.out.println("Destory Method : Bean Destroy");
	}

}
