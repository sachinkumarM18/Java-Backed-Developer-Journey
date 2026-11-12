package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name);
	}
}

public class Test1 {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		Employee emp1 = new Employee("Kodewala", 123);
		Employee emp2 = new Employee("Kodewala", 123);
		Employee emp3 = new Employee("Kodewala", 123);
		Employee emp4 = new Employee("Kodewala", 123);

		System.out.println("Emp1 : " + emp1.hashCode() + " Emp2 : " + emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		System.out.println(employees);
	}

}
