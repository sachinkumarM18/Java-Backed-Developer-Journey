package com.Kodewala.Thread1;

class Number extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <=20; i++) {
			System.out.print(" " + i); 
		}
	}
}

class Driver4 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Number num1 = new Number();
		num1.start();
		
//		Number num2 = new Number();
//		num2.start();
		
		
	}

}
