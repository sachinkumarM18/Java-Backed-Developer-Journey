package com.kodewala.ecommerce.order.management;

public class PrimeOrderService implements IOrderService{

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Prime User Order Placed with Fast Delivery");
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Prime User Order Cancelled");
	}

	@Override
	public void trackOrder() {
		// TODO Auto-generated method stub
		System.out.println("Tracking Prime User Order in Real-Time");
	}

}
