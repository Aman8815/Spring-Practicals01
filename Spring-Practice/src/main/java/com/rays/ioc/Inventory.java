package com.rays.ioc;

public class Inventory {
	
	int stock;
	
	
	public int sold(int qty) {
		
		stock -= qty;
		return stock;
	}

}
