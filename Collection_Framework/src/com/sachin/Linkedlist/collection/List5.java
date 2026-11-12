package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class List5 {

	public static void main(String[] args) {

		LinkedList<String> tasks = new LinkedList<>();

		tasks.add("TASK-101");
		tasks.add("TASK-102");
		tasks.add("TASK-103");
		tasks.add("TASK-104");
		tasks.add("TASK-105");

		// Add new task at the end
		tasks.addLast("TASK-999");

		// Process first task
		String processedTask = tasks.removeFirst();

		System.out.println(processedTask + " processed successfully");

		// Check whether TASK-999 is present
		boolean isPresent = tasks.contains("TASK-999");

		System.out.println("TASK-999 is present: " + isPresent);

		// Get first and last pending task
		String firstPendingTask = tasks.getFirst();
		String lastPendingTask = tasks.getLast();

		System.out.println("First Pending Task: " + firstPendingTask);
		System.out.println("Last Pending Task: " + lastPendingTask);

		System.out.println("Final Tasks:");
		System.out.println(tasks);
	}
}