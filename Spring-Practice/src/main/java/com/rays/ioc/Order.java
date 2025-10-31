package com.rays.ioc;

public class Order {

	private Payment payment;
	private Inventory inventory;
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void bookAticket(int items) {
		
		int price = 10;
		
		int totalamt = items*price;
		
		double updatebalance = payment.makePayment(totalamt);
		
		int updatestock = inventory.sold(items);
		
		System.out.println("");
	}
	
}
