package com.kodewala.Synchronized;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		Map<String, Integer> productDetails = new HashMap<String, Integer>();
		productDetails.put("iPhone16", 160000);
		productDetails.put("Samsung S26 ultra", 150000);
		productDetails.put("LG30", 15000);
		productDetails.put("Godrej25", 60000);

		System.out.println(productDetails);
 
		// Process it (Reading + Modifying)

		Map<String, Integer> productPriceSync = Collections.synchronizedMap(productDetails);
		// Modification ---> 200ms ---> 500 People were trying to buy
		productPriceSync.put("LG30", 96000);
		// result is : data issue resolved --> slowness
		// Concurrent and CAS
		// Segment luck
		System.out.println(productDetails);
	}

}
