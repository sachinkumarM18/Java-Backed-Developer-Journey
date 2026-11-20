package com.sachin.StreamApi.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Driver1 {

	public static void main(String[] args) {
		// 1. use filter() to find all numbers greater than 50.
//		List<Integer> numbers = Arrays.asList(10, 5, 40, 23, 45, 17, 95, 21, 2);
//		List<Integer> output = numbers.stream().filter(n -> n > 50).collect(Collectors.toList());
//		System.out.println(output);

		// 2. use map() to convert all names to uppercase.
//		List<String> names = Arrays.asList("Sachin", "Parvez", "Nitin", "jatin");
//		List<String> output = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//		System.out.println(output);

		// 3. use filter() to find products with price greater than 1,000 and map() to
		// apply a 10% discount.

		// List<Employee> details = new ArrayList<Employee>();

		Employee e1 = new Employee("Sachin", 7550);
		Employee e2 = new Employee("Parvez", 80000);
		Employee e3 = new Employee("Nitin", 100000);
		Employee e4 = new Employee("Jatin", 96000);

		List<Employee> details = Arrays.asList(e1, e2, e3, e4);
		List<String> output = details.stream().filter(emp -> emp.salary > 50000).map(emp -> emp.name)
				.collect(Collectors.toList());
		System.out.println(output);
	}

}
