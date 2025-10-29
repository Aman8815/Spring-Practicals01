package com.rays.ioc2;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value(value="10")
	int stock =0;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int sold(int qty) {
		stock -=qty;
		return stock;
	}

}
