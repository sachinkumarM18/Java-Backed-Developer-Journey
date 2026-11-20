package com.kodewala.exceptCabBooking;

class CabService {
	public void cabBooking(String pickupLoaction, String dropLocation, int passenger) throws Exception {
		try {
			if (pickupLoaction == null) {
				throw new Exception("Pickup Location Can't be Null");
			}
			if (dropLocation == null) {
				throw new Exception("Drop Location Can't be Null");
			}
			if (passenger == 0) {
				throw new Exception("Passenger Must be Greater than 0");
			}
			if (passenger > 4) {
				throw new Exception("Maximum 4 Passenger are Allowed.");
			}

			System.out.println("Cab Booked Successfully");
			System.out.println("Pickup : " + pickupLoaction);
			System.out.println("Drop : " + dropLocation);
			System.out.println("Passenger : " + passenger);

		} finally {
			System.out.println("Closing Cab Booking System");
		}
	}
}
