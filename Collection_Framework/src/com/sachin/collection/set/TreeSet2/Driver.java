package com.sachin.collection.set.TreeSet2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment> {
	String refId;
	int id;

	public Payment(String refId , int id) {
		super();
		this.refId = refId;
		this.id = id;
	}

	@Override
	public int compareTo(Payment o) {
		int result = this.refId.compareTo(o.refId);
		// System.out.println(this.refId + " , " + o.refId + " and result is " + result);
		return result;
	}

	@Override
	public String toString() {
		return "Payment [refId = " + refId + ", id=" + id + "]";
	} 

	
}

public class Driver {

	public static void main(String[] args) {
		Set<Payment> payments = new TreeSet<Payment>();
		Payment p1 = new Payment("ABCD", 120);
		Payment p2 = new Payment("SHKK", 20);
		Payment p3 = new Payment("CGH", 450);
		Payment p4 = new Payment("MNBB", 016);

		payments.add(p1);
		payments.add(p2);
		payments.add(p3);
		payments.add(p4);
		Iterator<Payment> itr = payments.iterator();
		while (itr.hasNext()) {
			Payment payment = itr.next();
			System.out.println(payment);
		}
	}

}
