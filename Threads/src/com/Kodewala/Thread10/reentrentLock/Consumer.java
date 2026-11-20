package com.Kodewala.Thread10.reentrentLock;

public class Consumer extends Thread {
	private final Task task;

	public Consumer(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				task.consume();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
		}
	}
}
