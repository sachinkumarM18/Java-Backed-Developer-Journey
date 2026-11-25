
package com.xmlbeanCreation.service;

public class OrderService {

	private PaymentService paymentService;
	private InventryService inventryService;

	private String customerName;
	private double orderAmount;
	private int quantity;

	public void placeOrder() {

		System.out.println("\n========== ORDER PROCESSING ==========");

		System.out.println("Customer Name: " + customerName);
		System.out.println("Order Amount Rs: " + orderAmount);

		// Step 1: Verify Inventory
		boolean available = inventryService.checkAvailability(quantity);

		if (!available) {
			System.out.println("Order Failed: Insufficient Stock!");
			return;
		}

		// Step 2: Process Payment
		paymentService.processPayment(orderAmount);

		// Step 3: Confirm Order
		System.out.println("\nOrder Placed Successfully!");
		System.out.println("======================================");
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public InventryService getInventryService() {
		return inventryService;
	}

	public void setInventryService(InventryService inventryService) {
		this.inventryService = inventryService;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
