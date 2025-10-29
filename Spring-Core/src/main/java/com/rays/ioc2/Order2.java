package com.rays.ioc2;

public class Order2 {
	
	private Payment payment;
	private Car car;
	public Order2(Payment payment, Car car) {
		
		this.payment = payment;
		this.car = car;
	}
	
	public void bookAcar(int items) {
		
		int price = 1000;
		
		int TotalAmount = items*price;
		
		
		double updateAmount = payment.makePayment(TotalAmount);
		
		int updateStock = car.sold(items);
		
		System.out.println("Tickets are Booked ");
		System.out.println("UPdated Balance =  " + updateAmount);
		System.out.println("UpdatedStock = " + updateStock);
		System.out.println("CAR booked = " + items);
	}

}
