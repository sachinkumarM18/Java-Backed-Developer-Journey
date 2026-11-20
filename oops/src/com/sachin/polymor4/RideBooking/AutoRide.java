package com.sachin.polymor4.RideBooking;

public class AutoRide extends Ride {

	public AutoRide(double distance) {
		super(distance);
	}

	public double calculateFare() {
		return 30 + (distance * 10);
	}
}
