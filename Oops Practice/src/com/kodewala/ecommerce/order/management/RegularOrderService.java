package com.kodewala.ecommerce.order.management;

public class RegularOrderService implements IOrderService{

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Regular User Order Placed");
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Regular User Order Cancelled");
	}

	@Override
	public void trackOrder() {
		// TODO Auto-generated method stub
		System.out.println("Tracking Regular User Order");
	}
	
	@Override 
	public void printInvoice() {
		System.out.println("Invoice Printed");
	}
}
