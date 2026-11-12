package com.sachin.CollectionRevision3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Delivery implements Comparable<Delivery> {
	private int deliveryId;
	private String customerName;
	private String restaurantName;
	private String city;
	private String deliveryType;
	private double amount;
	private double distance;

	public Delivery(int deliveryId, String customerName, String restaurantName, String city, String deliveryType,
			double amount, double distance) {
		this.deliveryId = deliveryId;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.city = city;
		this.deliveryType = deliveryType;
		this.amount = amount;
		this.distance = distance;
	}

	// Using Getters
	public int getdeliveryId() {
		return deliveryId;
	}

	public String getrestaurantName() {
		return restaurantName;
	}

	public String getcustomerName() {
		return customerName;
	}

	public String getCity() {
		return city;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public double getAmount() {
		return amount;
	}

	public double getDistance() {
		return distance;
	}

	// To String Method
	@Override
	public String toString() {
		return "Delivery [deliveryId = " + deliveryId + ", customerName = " + customerName + ", restaurantName = "
				+ restaurantName + ", city = " + city + ", deliveryType = " + deliveryType + ", amount = " + amount
				+ ", distance = " + distance + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Delivery)) {
			return false;
		}
		Delivery other = (Delivery) obj;
		return deliveryId == other.deliveryId;
	}

	@Override
	public int hashCode() {
		return deliveryId;
	}

	// Using Comparable
	@Override
	public int compareTo(Delivery o) {
		int result = Double.compare(o.amount, this.amount);
		return result;
	}

	public static void main(String[] args) {
		Set<Delivery> deliveryDetails = new HashSet<Delivery>();

		deliveryDetails.add(new Delivery(301, "Sachin", "Dominos", "Bangalore", "EXPRESS", 850, 5.2));

		deliveryDetails.add(new Delivery(302, "Rahul", "McDonalds", "Mumbai", "NORMAL", 470, 8.5));

		deliveryDetails.add(new Delivery(303, "Aman", "KFC", "Delhi", "EXPRESS", 1200, 4.0));

		deliveryDetails.add(new Delivery(304, "Sachin", "Dominos", "Bangalore", "EXPRESS", 850, 5.2));

		deliveryDetails.add(new Delivery(305, "Priya", "Subway", "Pune", "NORMAL", 650, 6.3));

		deliveryDetails.add(new Delivery(306, "Rahul", "McDonalds", "Mumbai", "NORMAL", 450, 8.5));

		deliveryDetails.add(new Delivery(307, "Zoya", "KFC", "Chennai", "EXPRESS", 1500, 3.5));

		deliveryDetails.add(new Delivery(308, "Aman", "KFC", "Delhi", "EXPRESS", 1800, 2.8));

		deliveryDetails.add(new Delivery(303, "Karan", "Subway", "Mumbai", "EXPRESS", 900, 5.0));

		deliveryDetails.add(new Delivery(310, "Zoya", "KFC", "Chennai", "EXPRESS", 1500, 3.5));

		List<Delivery> Details = new ArrayList<Delivery>(deliveryDetails);
		Collections.sort(Details);
		Collections.sort(Details, new SortByCity());
		Collections.sort(Details, new SortByDeliveryType());
		Collections.sort(Details, new SortByRestaurant());
		// Printing Using For each loop
//		for (Delivery delivery : Details) {
//			System.out.println(delivery); 
//		}

		Map<String, Double> restaurantRevenue = new HashMap<>();
		for (Delivery delivery : Details) {
			String restaurantName = delivery.getrestaurantName();
			double amount = delivery.getAmount();

			if (restaurantRevenue.containsKey(restaurantName)) {
				double oldAmount = restaurantRevenue.get(restaurantName);
				restaurantRevenue.put(restaurantName, oldAmount + amount);
			} else {
				restaurantRevenue.put(restaurantName, amount);
			}
		}

		Iterator<Map.Entry<String, Double>> itr1 = restaurantRevenue.entrySet().iterator();
		double total = 0;
		while (itr1.hasNext()) {
			Map.Entry<String, Double> entry = itr1.next();
			total = total + entry.getValue();
		}

		System.out.println("Highest Revenue Restaurant : " + restaurantRevenue);
		System.out.println("Total Revenue :  " + total);
		// Printing using Iterator
//		Iterator<Delivery> itr = Details.iterator();
//		while (itr.hasNext()) {
//			Delivery delivery = itr.next();
//			System.out.println(delivery);
//		}

	}

}

// Short by City 
class SortByCity implements Comparator<Delivery> {

	@Override
	public int compare(Delivery o1, Delivery o2) {
		int result = o1.getCity().compareTo(o2.getCity());

		if (result == 0) {
			return Double.compare(o2.getAmount(), o1.getAmount());
		}
		return result;
	}

}

// Sort By Delivery Type
class SortByDeliveryType implements Comparator<Delivery> {

	@Override
	public int compare(Delivery o1, Delivery o2) {
		int result = o1.getDeliveryType().compareTo(o2.getDeliveryType());

		// Distance Ascending Order
		if (result == 0) {
			return Double.compare(o1.getDistance(), o2.getDistance());
		}
		// Amount Ascending Order

		if (result == 0) {
			return Double.compare(o2.getAmount(), o1.getAmount());
		}
		return result;
	}
}

// Sort By Restaurant
class SortByRestaurant implements Comparator<Delivery> {

	@Override
	public int compare(Delivery o1, Delivery o2) {
		int result = o1.getrestaurantName().compareTo(o2.getrestaurantName());

		// Sort by Amount in Descending Order
		if (result == 0) {
			return Double.compare(o2.getAmount(), o1.getAmount());
		}

		// Sort By CustomerName
		if (result == 0) {
			return o1.getcustomerName().compareTo(o2.getcustomerName());
		}
		return result;
	}

}