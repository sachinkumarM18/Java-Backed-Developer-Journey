package com.Kodewala.Thread2.reentrrentLock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

class MovieBooking {

	private int availableSeat = 5;

	private final ReentrantLock lock = new ReentrantLock();

	public String bookTicket(String customerName) {

		lock.lock();

		try {

			System.out.println(
					"[" + Thread.currentThread().getName() + "] " + customerName + " is trying to book a ticket");

			if (availableSeat > 0) {

				availableSeat--;

				System.out.println(customerName + " successfully booked a ticket");

				System.out.println("Remaining tickets: " + availableSeat);

				return customerName + " -> Booking Successful";

			} else {

				System.out.println(customerName + " -> Tickets Sold Out");

				return customerName + " -> Booking Failed";
			}

		} finally {

			lock.unlock();
		}
	}

	public int getAvailableSeat() {
		return availableSeat;
	}
}

class CustomerTask implements Callable<String> {

	private final MovieBooking movieBooking;
	private final String customerName;

	public CustomerTask(MovieBooking movieBooking, String customerName) {

		this.movieBooking = movieBooking;
		this.customerName = customerName;
	}

	@Override
	public String call() throws Exception {

		return movieBooking.bookTicket(customerName);
	}
}

public class MoviesBookingSystem {

	public static void main(String[] args) {

		// Shared resource
		MovieBooking movieBooking = new MovieBooking();

		// Thread Pool
		ExecutorService executor = Executors.newCachedThreadPool();

		// Future array
		Future<String>[] futures = new Future[10];

		try {

			// Create and submit 10 customer tasks
			for (int i = 0; i < 10; i++) {

				CustomerTask task = new CustomerTask(movieBooking, "Customer-" + (i + 1));

				futures[i] = executor.submit(task);
			}

			// Get results
			for (int i = 0; i < 10; i++) {

				System.out.println("RESULT: " + futures[i].get());
			}

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

			System.out.println("Main thread was interrupted.");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			executor.shutdown();
		}

		System.out.println("\nFinal Available Seats: " + movieBooking.getAvailableSeat());
	}
}