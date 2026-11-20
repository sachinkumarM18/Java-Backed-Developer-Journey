package com.kodewala.abstra.Interface;

public class ConfirmOrder implements Ordermanagemant{

	@Override
	public void checkAvailability() {
		System.out.println("ConfirmOrder.checkAvailability()");
		
	}

	@Override
	public void shippedOrder() {
		
		System.out.println("ConfirmOrder.shippedOrder()");
	}

	@Override
	public void editOrder() {
		System.out.println("ConfirmOrder.editOrder()");
	}

	@Override
	public void confirmOrder() {
		System.out.println("ConfirmOrder.confirmOrder()");
	}

	@Override
	public void placeOrder() {
		System.out.println("ConfirmOrder.placeOrder()");
		
	}

}
