package com.rays.ioc2;

public class Payment {
	
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
