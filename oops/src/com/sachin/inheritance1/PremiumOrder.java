package com.sachin.inheritance1;

class PremiumOrder extends Order {
	private double discount;

	// TODO Auto-generated constructor s
	public PremiumOrder(String orderId, double amount, double discount) {
		this.discount = discount;
		super(orderId, amount);
		System.out.println("PremiumOrder constructor");
	}

	@Override
	public void processOrder() {
		System.out.println("Processing Premium Order");
		super.processOrder();
		System.out.println("Applying Premium Bebefits");
	}
}
