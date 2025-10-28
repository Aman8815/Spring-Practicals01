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

	public void bookATicket(int items) {

		int price = 10;

		int totalAmount = items * price;

		double updateBalance = payment.makePayment(totalAmount);

		int updateStock = inventory.sold(items);

		System.out.println("Tickets are Booked");
		System.out.println("UPdated Balance " + updateBalance);
		System.out.println("UpdatedStock" + updateStock);
		System.out.println("Tickets booked" + items);

	}
}
