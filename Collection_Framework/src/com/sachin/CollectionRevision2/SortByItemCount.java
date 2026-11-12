package com.sachin.CollectionRevision2;

import java.util.Comparator;

public class SortByItemCount implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		// First: itemCount → descending
		int result = Integer.compare(o2.getitemCount(), o1.getitemCount());

		 // If itemCount is same: customerName → alphabetical
		if (result == 0) {
			result = o1.getcustomerName().compareTo(o2.getcustomerName());
		}
		return result;
	}

}
