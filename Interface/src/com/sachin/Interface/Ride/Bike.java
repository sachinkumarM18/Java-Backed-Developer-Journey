package com.sachin.Interface.Ride;

public class Bike implements Ride {

	@Override
	public void startRide() {
		System.out.println("Bike ride started.");
	}

	@Override
	public void endRide() {
		System.out.println("Bike ride ended.");
	}

	@Override
	public void calculateFare() {
		System.out.println("Bike fare calculated based on distance.");
	}

	// We DON'T override showDriverDetails()
	// Therefore BikeRide uses the default implementation.
}