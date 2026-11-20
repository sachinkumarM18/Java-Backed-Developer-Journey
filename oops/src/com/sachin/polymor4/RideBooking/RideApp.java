package com.sachin.polymor4.RideBooking;

public class RideApp {

	public static void main(String[] args) {
		Ride ride;

		ride = new BikeRide(10);
		System.out.println("Bike Fare : ₹" + ride.calculateFare());

		if(ride instanceof BikeRide) {
			BikeRide bike = (BikeRide) ride;
			bike.showHelmetWarning();
		}
		
		
		
		ride = new CarRide(10);
		System.out.println("Car Ride : ₹" + ride.calculateFare());

		ride = new AutoRide(10);
		System.out.println("Auto Ride : ₹" + ride.calculateFare());
	}

}
