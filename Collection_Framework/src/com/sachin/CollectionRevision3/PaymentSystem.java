package com.sachin.CollectionRevision3;

import java.util.HashMap;
import java.util.Map;

class PaymentSystem {

	public static void main(String[] args) {
		Map<Integer, String> payments = new HashMap<Integer, String>();
		payments.put(511, "Success");
		payments.put(510, "Failed");
		payments.put(505, "Success");
		payments.put(530, "Failed");
		payments.put(509, "Success");

		 System.out.println("Payments Details");

		for (Map.Entry<Integer, String> entry : payments.entrySet()) {
			int transactionId = entry.getKey();
			String status = entry.getValue();
			System.out.println("TransactionId : " + transactionId + " Status : " + status);
		}
 
		System.out.println("\nFailed Transactions: ");

		for (Map.Entry<Integer, String> entry : payments.entrySet()) {
			if (entry.getValue().equals("Failed")) {
				System.out.println("Transaction Id: " + entry.getKey());
			}
		}
	}

}
