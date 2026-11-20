package com.Kodewala.Thread2LifeCycleSynchronize;

class Portfolio {
	public void checkPortfolio() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Checking Portfolio : " + i + " [" + Thread.currentThread().getName() + " ]");
		}
	}
}

class PortfolioThread extends Thread {
	Portfolio portfolio;

	PortfolioThread(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public void run() {
		portfolio.checkPortfolio();
	}
}

class TradingSystem {

	public static void main(String[] args) {
		Portfolio portfolio = new Portfolio();
		PortfolioThread p1 = new PortfolioThread(portfolio);
		p1.setName("Trader-Thread-1");

		PortfolioThread p2 = new PortfolioThread(portfolio);
		p2.setName("Trader-Thread-2");

		p1.start();
		p2.start();
	}

}
