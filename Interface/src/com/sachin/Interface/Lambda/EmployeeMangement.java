package com.sachin.Interface.Lambda;

@FunctionalInterface
interface SalaryRevision {
	double calculate(double salary, double percentage);
}

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
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

	public double getSalary() {
		return salary;
	}
}

public class EmployeeMangement {

	public static void main(String[] args) {
		Employee employee = new Employee(130, "Sachin", 50000);

		// Excellent Performance ->15%
		// SalaryRevision excellent = (salary, percentage) -> (salary * 15 / 100);

		// Good performance → 10%
		// SalaryRevision good = (salary, percentage) -> salary + (salary * 10 / 100);

		// Average performance → 5%
		// SalaryRevision average = (salary, percentage) -> salary + (salary * 5 / 100);

		// Common salary revision logic
		SalaryRevision revision = (salary, percentage) -> salary + (salary * percentage / 100);

		System.out.println("Employee : " + employee.getName());

		System.out.println("Old Salary : " + employee.getSalary());

		// System.out.println("After 15% increment : " + revision.calculate(50000, 15));

//		System.out.println("Employee : " + employee.getName());
//
//		System.out.println("Old Salary : " + employee.getSalary());

		// 15% increment
		System.out.println("After 15% Increment : " + revision.calculate(employee.getSalary(), 15));

		System.out.println("After 20% Increment : " + revision.calculate(employee.getSalary(), 20));

		// 10% increment
		System.out.println("After 10% Increment : " + revision.calculate(employee.getSalary(), 10));

		// 5% increment
		System.out.println("After 5% Increment : " + revision.calculate(employee.getSalary(), 5));
	}

}
