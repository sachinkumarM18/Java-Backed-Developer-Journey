package com.sachin.StreamApi.Practice4;

import java.util.Arrays;
import java.util.List;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee : " + name + "," + " Salary :" + salary;
	}
}

class Driver1 {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Rahul", 85000), new Employee("Priya", 72000),
				new Employee("Arjun", 48000), new Employee("Sneha", 85000), new Employee("Vikram", 63000));
		String sal = emp.stream().sorted((a, b) -> Double.compare(b.salary, a.salary)).skip(1)
				.map(e -> e.name + " : " + e.salary).findFirst().orElse(null);

	}

}
