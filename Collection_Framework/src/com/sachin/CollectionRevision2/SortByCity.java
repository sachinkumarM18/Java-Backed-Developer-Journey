package com.sachin.CollectionRevision2;

import java.util.Comparator;

public class SortByCity implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {

		// city → alphabetical
		int result = o1.getcityName().compareTo(o2.getcityName());

		// same city → totalAmount descending
		if (result == 0) {
			result = Double.compare(o2.gettotalAmount(), o1.gettotalAmount());
		}

		return result;
	}
}