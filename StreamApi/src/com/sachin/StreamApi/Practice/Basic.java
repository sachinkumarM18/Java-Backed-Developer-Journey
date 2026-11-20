package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student {
	int id;
	String name;
	int salary;

	public Student(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}

class Basic {

	public static void main(String[] args) {

		// Filter Salary Greater than 50000
		// List<Integer> salaries = Arrays.asList(45000, 55000, 72000, 48000, 90000,
		// 65000, 50000);

		// Sorting the Salary
		// salaries.stream().sorted().forEach(salary -> System.out.println(salary));

		// Filtering the Salary above 50k
		// salaries.stream().filter(salary -> salary > 50000).forEach(e ->
		// System.out.println(e));

		// Filtering the Salary above 50k and Add 5k
//		salaries.stream().filter(salary -> salary > 50000).map(salary -> salary + 5000)
//				.forEach(e -> System.out.println(e));

		// Print Salary from Highest to Lowest
		// salaries.stream().sorted((a, b) -> (b - a)).forEach(salary ->
		// System.out.println(salary));

		// Find and print the top 3 highest salaries using:
		// salaries.stream().sorted((a, b) -> (b - a)).limit(3).forEach(salary ->
		// System.out.println(salary));

		// Find the 2nd highest salary using: sorted() ,skip(),findFirst()
//		Integer output = salaries.stream().sorted((a, b) -> b - a).skip(1).findFirst().orElse(0);
//		System.out.println(output);

//		List<String> names = Arrays.asList("Sachin", "Rahul", "Amit", "Sachin", "Priya", "Amit", "Rahul", "Neha");
//		names.stream().distinct().forEach(name -> System.out.println(name));

		// Find and print the names whose length is greater than 5.
//		List<String> names = Arrays.asList("Sachin", "Rahul", "Amit", "Priya", "Neha", "Vikas");
//		names.stream().filter(name -> name.length() > 5).map(name -> name + " : " + name.length())
//				.forEach(e -> System.out.println(e));

		// 2nd Highest Distinct Salary

//		List<Integer> salaries = Arrays.asList(45000, 75000, 60000, 90000, 75000, 50000, 85000, 95000, 60000, 70000,
//				95000, 85000);
//		
//		Integer output = salaries.stream().distinct().sorted((a,b) -> (b - a)).skip(1).findFirst().orElse(0);
//		System.out.println(output);

		// Find employees whose salary is greater than ₹60,000
		Student emp1 = new Student(131, "Sachin", 78000);
		Student emp2 = new Student(111, "Abhi", 80000);
		Student emp3 = new Student(151, "Neha", 80000);
		Student emp4 = new Student(141, "Roshni", 75000);
		Student emp5 = new Student(101, "Shradha", 40000);

		List<Student> details = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
//		details.stream().filter(stu -> stu.salary > 60000).map(stu -> stu.name + " : " + stu.salary)
//				.forEach(e -> System.out.println(e));

		// Find the employee with the highest salary
		String output = details.stream().distinct().sorted((a, b) ->Integer.compare( b.getSalary(),a.getSalary()))
				.map(stu -> stu.name + " : " + stu.salary).skip(1).findFirst().get();
		// forEach(e -> System.out.println(e));
		System.out.println(output);
	}

}
