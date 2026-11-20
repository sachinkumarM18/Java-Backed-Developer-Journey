package com.sachin.polymor1;

class Delivery {
	public void estimateTime(String src, String des) {
		System.out.println("Estimate Delivery");
	}
}

class ExpressDelivery extends Delivery {
	@Override
	public void estimateTime(String src, String des) {
		System.out.println("Estimate Delivery");
	}
}

class OneDayDelivery extends ExpressDelivery {
	public void estimateTime(String src, String dest) {
		System.out.println("One Day Delivery Happening");
	}
}

public class Driver1 {

	public static void main(String[] args) {
		Delivery del = new ExpressDelivery(); // Parent class can refer child object.
		// Compiler --> at the time of compilation, it will check estimateTime() exist
		// in Delivery or not.
		// Running --> actual object is create --> ExpressDelivery class. jvm will call
		// the methid of ExpressDelivery.
		// Why runtime polymorphism -->
		del.estimateTime("Btm", "Marathahali");
	}

}
