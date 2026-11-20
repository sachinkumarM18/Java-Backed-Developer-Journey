package com.sachin.polymor4.RideBooking;

public class BikeRide extends Ride {

	public BikeRide(double distance) {
		super(distance);
	}

	@Override
	public double calculateFare() {
		return 20 + (distance * 8);
	}

	public void showHelmetWarning() {
		System.out.println("Helmet is Mandatory!");
	}
}
