package com.sachin.CollectionRevision2;

import java.util.Comparator;

public class SortByName implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		// First: customerName → alphabetical
		int result = o1.getcustomerName().compareTo(o2.getcustomerName());

		// If customerName is same: orderId → ascending
		if (result == 0) {
			result = Integer.compare(o1.getorderId(), o2.getitemCount());
		}
		return result;
	}

}
