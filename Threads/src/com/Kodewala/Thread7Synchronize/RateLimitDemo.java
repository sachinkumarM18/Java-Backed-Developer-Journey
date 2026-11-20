package com.Kodewala.Thread7Synchronize;

class RateLimiter {
	private int requestCount = 0;
	private final int maxRequest = 2;

	public static boolean allowRequest(RateLimiter limiter) {
		synchronized (limiter) {
			if (limiter.requestCount < limiter.maxRequest) {
				limiter.requestCount++;
				System.out.println(
						"[" + Thread.currentThread().getName() + "] Request Allowed. Count : " + limiter.requestCount);
				return true;
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Request Rejected. Rate Limit exceeded.");
				return false;
			}
		}
	}

	public int getRequestCount() {
		return requestCount;
	}
}

class ApiThread1 extends Thread {
	private RateLimiter limiter;

	public ApiThread1(RateLimiter limiter) {
		this.limiter = limiter;
	}

	@Override
	public void run() {
		RateLimiter.allowRequest(limiter);
	}
}

class ApiThread2 extends Thread {
	private RateLimiter limiter;

	public ApiThread2(RateLimiter limiter) {
		this.limiter = limiter;
	}

	@Override
	public void run() {
		RateLimiter.allowRequest(limiter);
	}
}

class ApiThread3 extends Thread {
	private RateLimiter limiter;

	public ApiThread3(RateLimiter limiter) {
		this.limiter = limiter;
	}

	@Override
	public void run() {
		RateLimiter.allowRequest(limiter);
	}
}

class ApiThread4 extends Thread {
	private RateLimiter limiter;

	public ApiThread4(RateLimiter limiter) {
		this.limiter = limiter;
	}

	@Override
	public void run() {
		RateLimiter.allowRequest(limiter);
	}
}

class RateLimitDemo {

	public static void main(String[] args) throws InterruptedException {
		RateLimiter limiter = new RateLimiter();

		ApiThread1 t1 = new ApiThread1(limiter);
		ApiThread1 t2 = new ApiThread1(limiter);
		ApiThread1 t3 = new ApiThread1(limiter);
		ApiThread1 t4 = new ApiThread1(limiter);

		t1.setName("Api-Thread-1");
		t2.setName("Api-Thread-1");
		t3.setName("Api-Thread-1");
		t4.setName("Api-Thread-1");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("Total Request allowed : " + limiter.getRequestCount());
	}

}
