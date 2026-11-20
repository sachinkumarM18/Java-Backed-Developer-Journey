package com.Kodewala.Thread8.itc;

public class Producer extends Thread {
	Task task;

	public Producer(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				task.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
