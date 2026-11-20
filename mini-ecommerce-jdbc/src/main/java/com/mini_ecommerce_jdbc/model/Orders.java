package com.mini_ecommerce_jdbc.model;

import java.time.LocalDateTime;

public class Orders {

	private int orderId;
	private int customerId;
	private LocalDateTime orderDate; 
	private int totalAmount;
	private OrderStatus orderStatus;

	public Orders(int customerId, int totalAmount, OrderStatus orderStatus, PaymentStatus paymentStatus) {
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
	}

	public Orders(int orderId, int customerId, LocalDateTime localDateTime, int totalAmount, OrderStatus orderStatus) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = localDateTime;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus; 
	}

	private PaymentStatus paymentStatus;

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}
 
	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
				+ ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + "]";
	}
}
