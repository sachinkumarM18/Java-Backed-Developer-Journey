package com.kodewala.collectionsUtility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
	private final String orderId;
	private final BigDecimal amount;
	private final int priority;

	public Order(String orderId, BigDecimal amount, int priority) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.priority = priority;
	}

	public String getOrder() {
		return orderId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", priority=" + priority + "]";
	}

}

public class OrderProcessing {

	public static void main(String[] args) {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("ORD -101", new BigDecimal("1500"), 0));
		orders.add(new Order("ORD-102", new BigDecimal("1200"), 3));
		orders.add(new Order("ORD-103", new BigDecimal("8000"), 1));

		// Highest Amount first

		Collections.sort(orders, Comparator.comparing(Order::getAmount).reversed());
		System.out.println("Orders by Highest amount : ");

		for (Order order : orders) {
			System.out.println(order);
		}
	}

}
