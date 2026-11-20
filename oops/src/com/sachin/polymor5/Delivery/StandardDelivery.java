package com.sachin.polymor5.Delivery;

public class StandardDelivery extends Delivery {
	@Override
	public void deliverOrder() {
		System.out.println("Standard Delivery: Order will arrive in 3-5 days.");
	}
}
