package com.kodewala.date02.interf7.clone4;

class Invoice implements Cloneable {
	private String invoiceId;
	private String customerName;
	private double totalAmount;
	private String paymentStatus;

	public Invoice(String invoiceId, String customerName, double totalAmount, String paymentStatus) {

		this.invoiceId = invoiceId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
	}

	@Override

	public Invoice clone() throws CloneNotSupportedException {
		return (Invoice) super.clone();
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void displayInvoice() {
		System.out.println("--------------------------------------");
		System.out.println("Invoice ID      : " + invoiceId);
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Total Amount    : " + totalAmount);
		System.out.println("Payment Status  : " + paymentStatus);
		System.out.println("--------------------------------------");
	}
}
