package com.sachin.Interface.Ride;

public interface Ride {

	// 1. ABSTRACT METHODS
	// Every ride type MUST implement these methods.

	void startRide();

	void endRide();

	void calculateFare();

	// 2. DEFAULT METHOD
	// Common behavior provided by the interface.
	// Child classes can override it if required.

	default void showDriverDetails() {
		System.out.println("Driver details are not available.");
	}

	// Another default method using private helper methods

	default void showTripSummary() {

		System.out.println("\n--- Trip Summary ---");

		validateRide();
		calculateDistance();
		calculateBaseFare();

		System.out.println("Trip summary generated successfully.");
	}

	// 3. STATIC METHOD
	// Belongs to the interface itself.
	// It is NOT inherited by implementing classes.

	static boolean isValidDistance(double distance) {
		return distance > 0;
	}

	// 4. PRIVATE METHODS
	// Internal helper methods.
	// Only methods inside this interface can call them.

	private void validateRide() {
		System.out.println("Ride validation completed.");
	}

	private void calculateDistance() {
		System.out.println("Distance calculated.");
	}

	private void calculateBaseFare() {
		System.out.println("Base fare calculated.");
	}
}