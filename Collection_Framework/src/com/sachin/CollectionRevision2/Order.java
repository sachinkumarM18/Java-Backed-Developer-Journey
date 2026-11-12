package com.sachin.CollectionRevision2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Order implements Comparable<Order> {
	private int orderId;
	private String customerName;
	private String city;
	private double totalAmount;
	private int itemCount;

	Order(int orderId, String customerName, String city, double totalAmount, int itemCount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.city = city;
		this.totalAmount = totalAmount;
		this.itemCount = itemCount;
	}

	public int getorderId() {
		return orderId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public String getcityName() {
		return city;
	}

	public double gettotalAmount() {
		return totalAmount;
	}

	public int getitemCount() {
		return itemCount;
	}

	// HashCode and Equality
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		return orderId == other.orderId;
	}

	@Override
	public int hashCode() {
		return orderId;
	}

	// Comparable
	@Override
	public int compareTo(Order o) {
		int result = Double.compare(o.totalAmount, this.totalAmount);
		return result;
	}

	public String toString() {
		return "Order " + "OrderId : " + orderId + " Custoemer Name : " + customerName + " City : " + city
				+ " Total Amount : " + totalAmount + " Item Count : " + itemCount;
	}

	public static void main(String[] args) {
		Set<Order> orderDetails = new HashSet<Order>();

		orderDetails.add(new Order(101, "Parvez", "Bangalore", 4500, 4));
		orderDetails.add(new Order(102, "Jatin", "Mumbai", 7200, 2));
		orderDetails.add(new Order(103, "Sachin", "Delhi", 4500, 6));
		orderDetails.add(new Order(104, "Parvez", "Bangalore", 4500, 4));
		orderDetails.add(new Order(105, "Aman", "Pune", 1200, 3));
		orderDetails.add(new Order(106, "Jatin", "Mumbai", 7200, 2));
		orderDetails.add(new Order(107, "Rahul", "Chennai", 3200, 8));
		orderDetails.add(new Order(108, "Zoya", "Delhi", 9500, 5));

		List<Order> orders = new ArrayList<Order>(orderDetails);
		Collections.sort(orders);
		Collections.sort(orders, new SortByCity());
		Collections.sort(orders, new SortByItemCount());
		Collections.sort(orders, new SortByName());

		Iterator<Order> itr = orders.iterator();
		while (itr.hasNext()) {
			Order order = itr.next();
			System.out.println(order);
		}
	}

}
