package com.Kodewala.Thread1;

class CookingFood implements Runnable {

	private String task;

	CookingFood(String task) {
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println(task + "is prepared by " + Thread.currentThread().getName());
	}

}

class RestaurantRunnable {

	public static void main(String[] args) {
		CookingTask task1 = new CookingTask("Pizza");
		CookingTask task2 = new CookingTask("Burger");
		CookingTask task3 = new CookingTask("Biryani");
		CookingTask task4 = new CookingTask("Soup");

		task1.start();
		task2.start();
		task3.start();
		task4.start();
	}

}
