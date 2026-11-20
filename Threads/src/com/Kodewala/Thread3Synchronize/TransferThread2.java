package com.Kodewala.Thread3Synchronize;

public class TransferThread2 extends Thread {
	private BankAccount sender;
	private BankAccount receiver;

	public TransferThread2(BankAccount sender, BankAccount receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	@Override
	public void run() {
		sender.transfer(receiver, 500);
	}
}
