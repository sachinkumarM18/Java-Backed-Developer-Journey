package com.Kodewala.Thread4Synchronize;

class TransferThread2 extends Thread {
	private BankAccount receiver;
	private BankAccount sender;

	public TransferThread2(BankAccount receiver, BankAccount sender) {
		this.receiver = receiver;
		this.sender = sender;
	}

	@Override
	public void run() {
		BankAccount.transfer(receiver, 800);
	}
}
