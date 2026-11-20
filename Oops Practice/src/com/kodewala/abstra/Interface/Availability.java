package com.kodewala.abstra.Interface;

public class Availability implements Ordermanagemant{

	@Override
	public void checkAvailability() {
		System.out.println("Availability.checkAvailability()");
		
	}

	@Override
	public void shippedOrder() {
		System.out.println("Availability.shippedOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("Availability.editOrder()");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("Availability.confirmOrder()");
	}

	@Override
	public void placeOrder() {
		System.out.println("Availability.placeOrder()");
	}
	
}
