package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Set;

class Payment {
	private String name;
	private int id;

	public Payment(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Payment payment = (Payment) obj;
		return this.name.equals(payment.name) & this.id == payment.id;
	}
}

public class Driver8 {
	public static void main(String[] args) {
		Set<Payment> payments = new HashSet<Payment>();
		Payment p1 = new Payment("UpiPayment", 2585);
		Payment p2 = new Payment("UpiPayment", 2585);

		System.out.println("P1:" + p1.hashCode() + "P2:" + p2.hashCode());
		System.out.println(p1.equals(p2));

		payments.add(p1);
		payments.add(p2);
		System.out.println(payments);
	}

}
