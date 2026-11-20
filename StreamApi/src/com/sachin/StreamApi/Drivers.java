package com.sachin.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Find the 2nd Highest Salary
class Employee {
	int id;
	String name;
	String department;
	int salary;

	public Employee(int id, String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}
}

class Drivers {

	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "Sachin", 100, "IT");
		Employee emp2 = new Employee(131, "Parvez", 100, "HR");
		Employee emp3 = new Employee(147, "Jatin", 10, "IT");
		Employee emp4 = new Employee(150, "Rohit", 20, "HR");
		Employee emp5 = new Employee(150, "Sachin", 205, "Sales");
		Employee emp6 = new Employee(150, "Rishabh", 200, "Calling");

		List<Employee> input = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
//		int sal = input.stream().map(e -> e.salary).distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1)
//				.findFirst().get();
//		 System.out.println(sal);
//		Employee e = input.stream().filter(s -> s.salary == sal).findFirst().get();
//		System.out.println(e.salary + " " + e.name);

		// Find Highest Salary without using Sorting

//		Employee Highestpaid = input.stream().max(Comparator.comparingInt(e -> e.getSalary())).orElse(null);
//		System.out.println("Highest Paid Salary : " + Highestpaid.getSalary());

		// Find the 2nd Highest Salary
		/*
		 * int salary = input.stream().map(sal ->
		 * sal.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).
		 * findFirst() .get(); System.out.println(salary);
		 */

//		int sal = input.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1)
//				.findFirst().get();
//		// System.out.println(sal);
//		Employee e = input.stream().filter(emp -> emp.getSalary() == sal).findFirst().get();
//		System.out.println("Name : " + e.getName() + " ," + " Salary : " + e.getSalary());

		// Find department wise Employees
//		Map<Object, List<Employee>> out = input.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		out.forEach((department, empList) -> {
//			System.out.print(department + " -> ");
//
//			empList.forEach(emp -> System.out.print(emp.getName() + " "));
//
//			System.out.println();
//		});

		// Containing the highest-paid employee from each department
		
	}

}
