package com.sachin.Hashcode.collection;

class Delivery {

}

public class Testing {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		System.out.println("Hash Code for S1 is : " + s1.hashCode());
		System.out.println("Hash Code for S2 is : " + s2.hashCode());

		System.out.println("Is S1 and S2 are Equal? : " + s1.equals(s2));

		Delivery d1 = new Delivery();
		Delivery d2 = new Delivery();

		System.out.println("Is S1 and S2 are Equal? : " + d1.equals(d2));

		System.out.println(d1.hashCode() + " and " + d2.hashCode());
	}

}
