package com.mini_ecommerce_jdbc.model;

public class OrderItem {
	private int orderItemId;
	private int orderId;
	private int productId;
	private int quantity;
	private int unitPrice;

	public OrderItem(int productId, int quantity, int uniPrice) {
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = uniPrice;
	} 

	public OrderItem(int orderItemId, int orderId, int productId, int quantity, int unitPrice) {

		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.productId = productId; 
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public int getOrderId() { 
		return orderId;
	}

	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

}
