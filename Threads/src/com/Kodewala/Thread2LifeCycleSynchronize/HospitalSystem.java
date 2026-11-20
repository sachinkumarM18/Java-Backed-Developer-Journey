package com.Kodewala.Thread2LifeCycleSynchronize;

class TokenDisplay {
	public synchronized void displayTokens() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Displaying Token : " + i + "[" + Thread.currentThread().getName() + "]");
		}
	}
}

class CounterThread extends Thread {
	TokenDisplay display;

	CounterThread(TokenDisplay _display) {
		this.display = _display;
	}

	@Override
	public void run() {
		display.displayTokens();
	}
}

class HospitalSystem {

	public static void main(String[] args) {
		TokenDisplay display = new TokenDisplay();
		CounterThread t1 = new CounterThread(display);
		t1.setName("Reception-Thread");

		CounterThread t2 = new CounterThread(display);
		t2.setName("Emergency-Thread");

		t1.start();
		t2.start();
	}

}
