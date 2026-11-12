package com.sachin.Hashcode.collection;

import java.util.HashMap;
import java.util.HashSet;

public class Driver7 {

	static void addressSession(HashSet<String> sessions, HashMap<Integer, String> bucketMap, String sessionId) {
		boolean added = sessions.add(sessionId);

		if (added) {
			int hash = sessions.hashCode();
			int spreadHash = hash ^ (hash >>> 16);
			int bucketNumber = spreadHash & 15;

			System.out.println("Session Id: " + sessionId);
			System.out.println("Hash : " + hash);
			System.out.println("Spread Hash : " + spreadHash);
			System.out.println("Bucket Number : " + bucketNumber);
		} else {
			System.out.println("Session Id : " + sessionId);
			// System.out.println("Bucket Number : " + bucketNumber);
			System.out.println("Session : Duplicate");
		}
		System.out.println("========================");
	}

	public static void main(String[] args) {
		HashSet<String> sessions = new HashSet<String>();
		HashMap<Integer, String> bucketMap = new HashMap<Integer, String>();

		addressSession(sessions, bucketMap, "SES1001");
		addressSession(sessions, bucketMap, "SES1002");
		addressSession(sessions, bucketMap, "SES1003");
		addressSession(sessions, bucketMap, "SES1004");
		addressSession(sessions, bucketMap, "SES1005");
		addressSession(sessions, bucketMap, "SES1003");
	}

}
