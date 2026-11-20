package com.ThreadPractice;

class Inventory {
	private int stock = 0;

	public synchronized void waitForStock() throws InterruptedException {
		while (stock == 0) {
			System.out.println(Thread.currentThread().getName() + " -> Waiting for Inventry...");
			wait();
		}
		stock--;
		System.out.println(Thread.currentThread().getName() + "Inventory reserved. Ramaining Stock : " + stock);
	}
 
	public synchronized void addStock(int quantity) {
		stock += quantity;
		System.out.println(Thread.currentThread().getName() + "-> Stock Added : " + quantity);
		notifyAll();
	}
} 

class PaymentTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "-> Payment processing started");
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "-> Payment Successfull");

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " -> Payment interrupted");
		}
	}
}

class InventoryTask implements Runnable {
	private final Inventory inventory;

	public InventoryTask(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "-> Inventory Processing Started");
			inventory.waitForStock();
			System.out.println(Thread.currentThread().getName() + "-> Inventory Processing Completed");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + "-> Inventory task Interrupted");
		}

	}

}

class WarehouseTask implements Runnable {

	private final Inventory inventory;

	public WarehouseTask(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			inventory.addStock(5);
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + "-> Warehouse update Completed");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

class NotificationTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "-> Sending notification");
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " -> Notification Sent");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

class OrderProcessingSystem {

	public static void main(String[] args) throws InterruptedException {
		Inventory inventory = new Inventory();
		Thread paymentThread = new Thread(new PaymentTask(), "Payment-Thread");
		Thread inventryThread = new Thread(new InventoryTask(inventory), "Inventry-Thread");
		Thread warehouseThread = new Thread(new WarehouseTask(inventory), "WareHouse-Thread");
		Thread notificationThread = new Thread(new NotificationTask(), "Notification-Thread");

		System.out.println("Order Created");

		paymentThread.start();
		inventryThread.start();
		warehouseThread.start();
		notificationThread.start();

		paymentThread.join();
		inventryThread.join();
		warehouseThread.join();
		notificationThread.join();

		System.out.println("Order Processing Completed");
	}

}
