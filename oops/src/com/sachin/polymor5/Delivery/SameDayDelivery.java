package com.sachin.polymor5.Delivery;

public class SameDayDelivery extends Delivery {
	@Override
	public void deliverOrder() {
		System.out.println("Same-Day Delivery: Order will arrive today.");
	}
}
