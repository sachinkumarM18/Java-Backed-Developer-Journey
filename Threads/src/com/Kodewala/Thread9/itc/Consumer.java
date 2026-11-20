package com.Kodewala.Thread9.itc;

public class Consumer extends Thread {
	Shared shared;

	public Consumer(Shared shared) {
		this.shared = shared;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				shared.consume(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
