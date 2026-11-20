package com.sachin.abstractClass1.payment;

public abstract class Payment {
	private final String transactionId ;

	protected Payment(String transactionId) {
		this.transactionId = transactionId;
	}

	public final String getTransactionId() {
		return transactionId;
	}

	public final void process(double amount) {
		validateAmount(amount);
		authentication();
		pay(amount);
		generateReceipt(amount);
	}

	private void validateAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be Geater than Zero");
		}
	}

	protected abstract void authentication();

	protected abstract void pay(double amount);

	private void generateReceipt(double amount) {
		System.out.println("Receipt Generated for Transaction : " + transactionId + ", amout" + amount);
	}
}
