package com.sachin.Interface.Ride;

public class RideDriver {

	public static void main(String[] args) {

		// ============================
		// CAR RIDE
		// ============================

		Ride car = new Car();

		car.startRide();

		car.calculateFare();

		car.showDriverDetails();

		car.showTripSummary();

		car.endRide();

		// ============================
		// BIKE RIDE
		// ============================

		System.out.println("\n============================");

		Ride bike = new Bike();

		bike.startRide();

		bike.calculateFare();

		bike.showDriverDetails();

		bike.showTripSummary();

		bike.endRide();

		// ============================
		// STATIC METHOD
		// ============================

		System.out.println("\n============================");

		double distance = 25.5;

		if (Ride.isValidDistance(distance)) {
			System.out.println("Distance " + distance + " KM is valid.");
		} else {
			System.out.println("Distance " + distance + " KM is invalid.");
		}
	}
}
