package com.rays.ioc2;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	double balance = 0;

	public double getBalance() {
		return balance;
	}
	@Value(value="10000")
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double makePayment(int qty) {
		balance = balance-qty;
		return balance;
	}
}
