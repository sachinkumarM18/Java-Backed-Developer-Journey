package com.sachin.abstractClass3.OrderProcess;

public abstract class OrderProcessor {

	// -----------------------------
	// 1. Private state
	// -----------------------------
	private final String orderId;
	private double amount;

	// -----------------------------
	// 2. Field initialization
	// -----------------------------
	protected String processorType = "BASE";

	// -----------------------------
	// 3. Abstract class constructor
	// -----------------------------
	protected OrderProcessor(String orderId, double amount) {

		if (orderId == null || orderId.isBlank()) {
			throw new IllegalArgumentException("Order ID is required");
		}

		if (amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}

		this.orderId = orderId;
		this.amount = amount;

		System.out.println("OrderProcessor constructor");
	}

	// -----------------------------
	// 4. Controlled access to state
	// -----------------------------
	protected final double getAmount() {
		return amount;
	}

	protected final void updateAmount(double amount) {

		if (amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}

		this.amount = amount;
	}

	protected final String getOrderId() {
		return orderId;
	}

	// -----------------------------
	// 5. Partial implementation
	// -----------------------------
	protected void validate() {

		System.out.println("Validating order: " + orderId);
	}

	protected void saveOrder() {

		System.out.println("Saving order: " + orderId);
	}

	// -----------------------------
	// 6. Template Method
	// -----------------------------
	public final void processOrder() {

		validate();

		calculateAmount();

		applyDiscount();

		saveOrder();

		sendNotification();
	}

	// -----------------------------
	// 7. Mandatory variable behavior
	// -----------------------------
	protected abstract void calculateAmount();

	// -----------------------------
	// 8. Hook method
	// -----------------------------
	protected void applyDiscount() {

		System.out.println("Default discount applied");
	}

	// -----------------------------
	// 9. Another hook method
	// -----------------------------
	protected void sendNotification() {

		System.out.println("Order notification sent");
	}

	// -----------------------------
	// 10. Common behavior
	// -----------------------------
	public void showOrderDetails() {

		System.out.println("Order ID : " + orderId);

		System.out.println("Amount   : " + amount);

		System.out.println("Type     : " + processorType);
	}
}