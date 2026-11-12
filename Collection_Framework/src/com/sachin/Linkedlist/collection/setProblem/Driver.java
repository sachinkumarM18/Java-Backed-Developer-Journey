package com.sachin.Linkedlist.collection.setProblem;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class OnlineShopping implements Comparable<OnlineShopping> {
	int productId;
	String productName;

	public OnlineShopping(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	// HashSet uses this for hashing

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(productId));
	}

	// HashSet Uses this for duplicates Checking

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OnlineShopping other = (OnlineShopping) obj;
		return productId == other.productId;
	}

	// Used for Ordering / Comparison
	@Override
	public int compareTo(OnlineShopping o) {

		return Integer.compare(this.productId, o.productId);
	}

	@Override
	public String toString() {
		return "OnlineShopping [productId=" + productId + ", productName=" + productName + "]";
	}

}

public class Driver {

	public static void main(String[] args) {
		TreeSet<OnlineShopping> product = new TreeSet<OnlineShopping>();
		product.add(new OnlineShopping(151, "No Ball"));
		product.add(new OnlineShopping(101, "Bat"));
		product.add(new OnlineShopping(121, "Ball"));
		product.add(new OnlineShopping(11, "Wicket"));
		product.add(new OnlineShopping(131, "Over"));

		// Duplicate Product Id
		product.add(new OnlineShopping(101, "Another Bat"));

		System.out.println("Total Products : " + product.size());
		System.out.println("\nProducts : ");

		Iterator<OnlineShopping> itr = product.iterator();
		while (itr.hasNext()) {
			OnlineShopping online = itr.next();
			System.out.println(online);
		}
	}

}
