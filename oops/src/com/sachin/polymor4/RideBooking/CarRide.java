package com.sachin.polymor4.RideBooking;

public class CarRide extends Ride {

	public CarRide(double distance) {
		super(distance);
	}

	@Override
	public double calculateFare() {
		return 50 + (distance * 15);
	}

}
