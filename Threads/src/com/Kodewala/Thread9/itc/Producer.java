package com.Kodewala.Thread9.itc;

public class Producer extends Thread {
	Shared shared;

	public Producer(Shared shared) {
		this.shared = shared;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				shared.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
