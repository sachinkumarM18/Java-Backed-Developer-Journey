package com.Kodewala.Thread2LifeCycleSynchronize;

class NetworkMonitor {
	public synchronized void monitorUsage() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Checking Network Usage : " + i + " [" + Thread.currentThread().getName() + " ]");
		}
	}
}

class MonitoringThread extends Thread{
	NetworkMonitor monitor;
	
	public MonitoringThread(NetworkMonitor _monitor) {
		this.monitor = _monitor;
	}
	
	@Override
	public void run() {
		monitor.monitorUsage();
	}
}

class TelecomSystem {

	public static void main(String[] args) {
		NetworkMonitor monitoring = new NetworkMonitor();
		MonitoringThread t1 = new MonitoringThread(monitoring);
		t1.setName("Tower-Thread-1");
		MonitoringThread t2 = new MonitoringThread(monitoring);
		t2.setName("Tower-Thread-2");
		
		t1.start();
		t2.start();
	}

}
