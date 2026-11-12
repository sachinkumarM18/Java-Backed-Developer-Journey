package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Iterator;

class Test4 {

	public static void main(String[] args) {

		HashSet<String> sessions = new HashSet<>();
		sessions.add("S101");
		sessions.add("S102");
		sessions.add("S103");
		sessions.add("S104");

		Iterator<String> iterator = sessions.iterator();
		while (iterator.hasNext()) {
			String session = iterator.next();
			if (isExpired(session)) {

				iterator.remove();

				System.out.println(session + " -> Expired and Removed");

			} else {

				System.out.println(session + " -> Active");
			}
			System.out.println("\nRemaining Active Sessions:");
			System.out.println(session);
		}

	}

	public static boolean isExpired(String session) {
		return session.equals("S102") || session.equals("S104");
	}

}
