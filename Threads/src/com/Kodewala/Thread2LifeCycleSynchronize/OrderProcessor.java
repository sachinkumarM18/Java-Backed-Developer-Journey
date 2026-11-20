package com.Kodewala.Thread2LifeCycleSynchronize;

class OrderProcessor extends Thread {
	private String orderId;

	OrderProcessor(String orderName) {
		this.orderId = orderName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Started Processing Order" + orderId);

		try {

			System.out.println("Validating Order...");
			Thread.sleep(1000);

			System.out.println("Processing Payment...");
			Thread.sleep(2000);

			System.out.println("Processing Inventry...");
			Thread.sleep(3000);

			System.out.println("Sending Notification...");
			Thread.sleep(4000);

			System.out.println("Order Completed " + orderId);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Order Processing Interrupted" + orderId);
		}
	}

	public static void main(String[] args) {
		OrderProcessor order1 = new OrderProcessor("ORD101");
		OrderProcessor order2 = new OrderProcessor("ORD101");
		order1.start();
		order2.start();
	}

}
