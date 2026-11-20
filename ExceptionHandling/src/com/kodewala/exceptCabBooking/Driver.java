package com.kodewala.exceptCabBooking;

public class Driver {

	public static void main(String[] args) {
		CabService cab = new CabService();

		try {
			cab.cabBooking("Marathahalli", "Btm 2nd Stage", 0);
		} catch (Exception e) {
			System.out.println("Booking Failed : " + e.getMessage());
		} finally {
			System.out.println("Thank You for using Cap Service.");
		}
	}

}
