package com.Kodewala.Thread1;

class CookingTask extends Thread {
	private String task;

	public CookingTask(String task) {
		this.task = task;
	}
	@Override
	public void run() {
		System.out.println(task + " is being Prepared by " + Thread.currentThread().getName());
	}
}

class Reataurant {

	public static void main(String[] args) {
		CookingFood task1 = new CookingFood("Pasta");
		CookingFood task2 = new CookingFood("Maggi");
		CookingFood task3 = new CookingFood("Rasgoola");
		CookingFood task4 = new CookingFood("Pizza");
		
		task2.run();
	}

}
