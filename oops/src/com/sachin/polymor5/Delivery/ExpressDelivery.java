package com.sachin.polymor5.Delivery;

public class ExpressDelivery extends Delivery {
	@Override
	public void deliverOrder() {
		System.out.println("Express Delivery: Order will arrive tomorrow.");
	}
}
