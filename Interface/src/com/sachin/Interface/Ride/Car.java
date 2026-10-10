package com.sachin.Interface.Ride;

public class Car implements Ride {

	@Override
	public void startRide() {
		System.out.println("Car ride started.");
	}

	@Override
	public void endRide() {
		System.out.println("Car ride ended.");
	}

	@Override
	public void calculateFare() {
		System.out.println("Car fare calculated based on distance.");
	}

	// Overriding default method

	@Override
	public void showDriverDetails() {
		System.out.println("\n--- Driver Details ---");
		System.out.println("Driver Name : Rahul");
		System.out.println("Vehicle     : Honda City");
		System.out.println("Vehicle No  : BR29AB1234");
	}
}