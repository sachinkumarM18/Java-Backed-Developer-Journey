package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.List;

class Students {
	int id;
	String name;
	int marks;
	int salary;

	public Students(int id, String name, int marks, int salary) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public int getSalary() {
		return salary;
	}
}

class Driver5 {

	public static void main(String[] args) {
		List<Students> details = Arrays.asList(new Students(1, "Akash", 80, 95210),
				new Students(2, "Vikash", 70, 56230), new Students(3, "Suresh", 90, 65860),
				new Students(4, "Amit", 76, 45000), new Students(5, "Priya", 95, 90000),
				new Students(6, "Neha", 88, 65000), new Students(7, "Raj", 72, 40000),
				new Students(8, "Rakesh", 650, 56550));

		// Return the name of the student having the third-highest distinct salary, in
		// this format:
		String out = details.stream().distinct().sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary())).skip(2)
				.map(stu -> stu.name + " : " + stu.salary).findFirst().orElse("");
		System.out.println(out);
	}

}
