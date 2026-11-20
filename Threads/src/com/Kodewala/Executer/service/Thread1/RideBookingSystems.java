package com.Kodewala.Executer.service.Thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class DriverSearch implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Searching For a available Driver");
		Thread.sleep(2000);
		return "Abhay";
	}

}

class FareCalcualtion implements Callable<Double> {
	private double distance;

	public FareCalcualtion(double balance) {
		this.distance = balance;
	}

	@Override
	public Double call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Calculating fare from distance");
		Thread.sleep(1000);
		double fare = distance * 15;
		return fare;
	}

}

class EtaCalculation implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " Calculating ETA");
		Thread.sleep(1500);
		return "Driver will arrive in 8 minutes";
	}

}

class RideBookingSystems {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		String customer = "Sachin";
		double distance = 15;

		System.out.println("Customer requested a ride");
		System.out.println("Customer: " + customer);
		System.out.println("Distance: " + distance + " km");

		ExecutorService executor = Executors.newFixedThreadPool(3);

		Future<String> driverFuture = executor.submit(new DriverSearch());
		Future<Double> fareCalFuture = executor.submit(new FareCalcualtion(distance));
		Future<String> etaFuture = executor.submit(new EtaCalculation());

		// get Result

		String driverSearch = driverFuture.get();
		Double FareCaculat = fareCalFuture.get();
		String eta = etaFuture.get();

		System.out.println("\n---- Ride Result----");

		System.out.println("Driver found : " + driverSearch); 
		System.out.println("Fare : " + FareCaculat);
		System.out.println(eta);

		System.out.println("\nRide confirmed");

		executor.shutdown();

	}

}
