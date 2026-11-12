package com.sachin.collection.set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare( o.id, this.id);
	}

	@Override
	public String toString() {
		return id + " - " + name;
	}
}

public class Driver2 {

	public static void main(String[] args) {
		Set<Employee> employee = new TreeSet<Employee>();
		employee.add(new Employee("Sachin", 10));
		employee.add(new Employee("Pravez", 120));
		System.out.println(employee);
	}

}
