package com.sachin.abstractClass3.OrderProcess;

public class CurrentOrderProcessor extends OrderProcessor {

	public CurrentOrderProcessor(String orderId, double amount) {

		super(orderId, amount);

		System.out.println("CurrentOrderProcessor constructor");
	}

	@Override
	protected void calculateAmount() {

		System.out.println("Current account order - no tax calculation");
	}

	// We don't override applyDiscount().
	// Therefore default hook behavior will execute.
}
