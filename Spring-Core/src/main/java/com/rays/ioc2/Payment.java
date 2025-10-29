package com.rays.ioc2;

import org.springframework.beans.factory.annotation.Value;

public class Payment {
	@Value(value="10000")
	double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double makePayment(int qty) {
		balance = balance-qty;
		return balance;
	}
}
