package com.rays.ioc2;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	
	int stock =0;

	public int getStock() {
		return stock;
	}
	@Value(value="10")
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int sold(int qty) {
		stock -=qty;
		return stock;
	}

}
