package com.Kodewala.Thread2LifeCycleSynchronize;

class OrderProcessingException extends Exception {

	OrderProcessingException(String message) {
		super(message);
	}
}

class OrderProcessing extends Thread {
	private final String orderId;
	private final double amount;

	OrderProcessing(String orderId, double amount) {
		this.orderId = orderId;
		this.amount = amount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started... " + orderId);

		try {
			validateOrder();
			Thread.sleep(1000);

			processPayment();
			Thread.sleep(1000);

			updateInventry();
			Thread.sleep(1000);

			System.out.println("Ordered Completed " + orderId);
		} catch (OrderProcessingException e) {
			System.out.println("Order failed " + e.getMessage());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread Intrrupted While Processing" + e.getMessage() + orderId);
		}
	}

	private void validateOrder() throws OrderProcessingException {
		if (amount <= 0) {
			throw new OrderProcessingException("Invalid Amount " + orderId);
		}
		System.out.println("Ordered Validate " + orderId);
	}

	private void processPayment() throws OrderProcessingException {
		if (amount > 50000) {
			throw new OrderProcessingException("Payment limit exceed for " + orderId);
		}
		System.out.println("Payment Validated " + orderId);
	}

	private void updateInventry() {
		System.out.println("Inventry Updated " + orderId);
	}

	public static void main(String[] args) {
		OrderProcessing ord1 = new OrderProcessing("ORD101", 199);
		OrderProcessing ord2 = new OrderProcessing("ORD103", 99);

		ord1.start();
		//ord2.start();
	}

}
