package com.sachin.CollectionRevision;

import java.util.HashSet;

public class Customers {

	public Customers(int i, String string) {
		
	}
	
	
	public static void main(String[] args) {
		Customers c1 = new Customers(101 , "Vikash");
		Customers c2 = new Customers(101 , "Sachin");
		HashSet<Customers> customer = new HashSet<Customers>();
		customer.add(c1);
		customer.add(c2);
		System.out.println(customer);
	}

}
