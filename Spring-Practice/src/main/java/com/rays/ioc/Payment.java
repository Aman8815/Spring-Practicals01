package com.rays.ioc;

public class Payment {
	
  double balance;
  
  
  public double makePayment(int amt) {
	  
	  balance = balance-amt;
	  return balance;
  }

}
