package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> linkeList = new LinkedList<String>();
		linkeList.add("Patna");
		linkeList.add("BLR");
		linkeList.add("Patna");
		linkeList.add("Chhapra");
		linkeList.add("Siwan");
		linkeList.add("Chennai");
		linkeList.add("Patna");
		linkeList.add("Siwan");
		linkeList.add("Chhapra");
		linkeList.add("Chennai");
		linkeList.add("Patna");

		LinkedList<String> newlinkedList = new LinkedList<String>();
		newlinkedList.add("Gaya");
		newlinkedList.add("Munger");

		linkeList.addAll(newlinkedList);

		//boolean result = linkeList.containsAll(newlinkedList);
		//System.out.println(linkeList.removeAll(newlinkedList));
		System.out.println(linkeList.retainAll(newlinkedList));
		//System.out.println(result);

		// Ordered and Duplicate
//		System.out.println(linkeList);
//		System.out.println(linkeList.getFirst());
//		System.out.println(linkeList.getLast());
		// System.out.println(linkeList.get(1));
		// System.out.println(linkeList.indexOf("Siwan"));
		// System.out.println(linkeList.offerLast("Patna"));
//		linkeList.set(3, "Gopalganj");
//		linkeList.remove();
//		linkeList.remove(1);
//		linkeList.remove("Gopalganj");
//		linkeList.removeFirst();
//		linkeList.removeLast();
//		linkeList.removeFirstOccurrence("Chennai");
//		System.out.println(linkeList.contains("Siwan"));
//		System.out.println(linkeList.lastIndexOf("Patna"));
//		System.out.println(linkeList.size());
//		System.out.println(linkeList.isEmpty());
//		System.out.println(linkeList.offer("Siwan"));
//		System.out.println(linkeList.offerFirst("Chhapra"));

//		System.out.println(linkeList.offerLast("Chhapra"));
//		linkeList.peek();   // Accessing the value
//		linkeList.peekFirst();
//		linkeList.peekLast();

		// linkeList.push("Btm"); // Adding the value from start
		// linkeList.pop(); // Removing value from start
		System.out.println(linkeList);
	}

}
