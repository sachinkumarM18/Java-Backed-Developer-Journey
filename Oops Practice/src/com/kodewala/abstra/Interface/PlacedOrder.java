package com.kodewala.abstra.Interface;

public class PlacedOrder implements Ordermanagemant{

	@Override
	public void checkAvailability() {
		System.out.println("PlacedOrder.checkAvailability()");
		
	}

	@Override
	public void shippedOrder() {
		System.out.println("PlacedOrder.shippedOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("PlacedOrder.editOrder()");
	}

	@Override
	public void confirmOrder() {
		System.out.println("PlacedOrder.confirmOrder()");
		
	}

	@Override
	public void placeOrder() {
		System.out.println("PlacedOrder.placeOrder()");
		
	}
	
}
