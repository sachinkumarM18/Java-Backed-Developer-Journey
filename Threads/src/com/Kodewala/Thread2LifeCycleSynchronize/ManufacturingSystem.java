package com.Kodewala.Thread2LifeCycleSynchronize;

class MachineMonetringTask implements Runnable {
	private String name;

	public MachineMonetringTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Reading " + i + " From" + name + " Thread" + Thread.currentThread().getName());

			try {
				Thread.sleep(5000);

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println(name + " Monitoring Intrrupted");
			}

		}
		System.out.println(name + " Monitoring Completed");
	}

}

class ManufacturingSystem {

	public static void main(String[] args) {
		Runnable machine1 = new MachineMonetringTask("Machine -A");
		Runnable machine2 = new MachineMonetringTask("Machine -B");
		Runnable machine3 = new MachineMonetringTask("Machine -C");

		Thread t1 = new Thread(machine1);
		Thread t2 = new Thread(machine2);
		Thread t3 = new Thread(machine3);

		t1.setName("Sensor Thread-1");
		t2.setName("Sensor Thread -2");
		t3.setName("Sensor Thread -3");

		t1.start();
		t2.start();
		t3.start();

	}

}
