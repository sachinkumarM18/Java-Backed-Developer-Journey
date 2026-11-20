package com.Kodewala.Executer.service.Thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class InventryService implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Checking Inventry ....");
		Thread.sleep(1000);
		return "Inventry Available";
	}

}

class PaymentService implements Callable<Double> {
	private double amount;

	public PaymentService(double amount) {
		this.amount = amount;
	}

	@Override
	public Double call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Processing Payment...");
		return amount;
	}

}

class ShippingService implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Shipping Processing ...");
		Thread.sleep(1500);
		return "Shipping Charge : 100$";
	}

}

class OrderProcessingSystem {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executer = Executors.newFixedThreadPool(2);
		System.out.println("Customer Placed Order");

		Future<String> inventoryFuture = executer.submit(new InventryService());
		Future<Double> paymentFuture = executer.submit(new PaymentService(2500));
		Future<String> shippingFuture = executer.submit(new ShippingService());

		System.out.println("Main thread is free to do other work...");

		// Get Results

		String inventoryResult = inventoryFuture.get();
		Double PaymentResult = paymentFuture.get();
		String ShippingResult = shippingFuture.get();

		System.out.println("\n---- Order Result ----");

		System.out.println(inventoryResult);
		System.out.println("Payment Successful : " + PaymentResult);
		System.out.println(ShippingResult);

		System.out.println("Order Confirmed");
		executer.shutdown();
	}

}
