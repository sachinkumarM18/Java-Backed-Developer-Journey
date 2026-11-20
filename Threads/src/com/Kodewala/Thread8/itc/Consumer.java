package com.Kodewala.Thread8.itc;

public class Consumer extends Thread {
	Task task;

	public Consumer(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				task.consume(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
