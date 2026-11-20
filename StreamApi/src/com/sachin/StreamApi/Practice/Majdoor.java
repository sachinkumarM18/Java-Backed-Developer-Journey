package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Majdoor {
	int id;
	String name;
	String department;
	int marks;
	int salary;

	public Majdoor(int id, String name, String department, int marks, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getMarks() {
		return marks;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}

	public static void main(String[] args) {

		List<Majdoor> details = Arrays.asList(new Majdoor(1, "Ramesh", "Construction", 80, 95210),
				new Majdoor(2, "Suresh", "Plumbing", 70, 56230), new Majdoor(3, "Mahesh", "Construction", 90, 65860),
				new Majdoor(4, "Raju", "Electrical", 76, 45000), new Majdoor(5, "Mohan", "Construction", 95, 90000),
				new Majdoor(6, "Ganesh", "Plumbing", 88, 65000), new Majdoor(7, "Shyam", "Electrical", 72, 40000),
				new Majdoor(8, "Dinesh", "Construction", 65, 56550), new Majdoor(9, "Rakesh", "Plumbing", 91, 75000),
				new Majdoor(10, "Vijay", "Electrical", 85, 70000));

		// Find Second Highest Salary

//		Optional<String> out = details.stream().distinct().sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary())).skip(1)
//				.map(maj -> maj.name + " : " + maj.salary).findFirst();
//		System.out.println(out);

		// Find the student having the third-highest distinct salary.

//		Optional<String> out = details.stream().distinct().sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary())).skip(2)
//				.map(maj -> maj.name + " : " + maj.salary).findFirst();
//		System.out.println(out);

		// Find the highest-paid student from the IT department.

//		Optional<String> out = details.stream().distinct().filter(maj -> maj.getDepartment().equals("Construction"))
//				.sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary()))
//				.map(maj -> maj.name + " : " + maj.salary).findFirst();
//		System.out.println(out);

		// Find the Majdoor having the second-highest salary in the "Construction"
		// department.
		Optional<String> out = details.stream().distinct().filter(maj -> maj.getDepartment().equals("Construction"))
				.skip(1).sorted((a, b) -> Integer.compare(b.getSalary(), a.getSalary()))
				.map(maj -> maj.name + " : " + maj.salary).findFirst();
		System.out.println(out);

		// Find all Majdoor whose salary is greater than the average salary of all
		// Majdoor.

//		double averageSalary = details.stream().mapToInt(emp -> emp.getSalary()).average().orElse(0);
//		System.out.println("Average Salary : " + averageSalary);
//
//		List<String> HighestAvg = details.stream().filter(maj -> maj.getSalary() > averageSalary)
//				.map(maj -> maj.name + " : " + maj.salary).toList();
//		System.out.println(HighestAvg);

		// Find the highest-paid Majdoor from each department.


//		Map<String, Majdoor> result = details.stream().collect(Collectors.groupingBy(Majdoor::getDepartment, Collectors
//				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Majdoor::getSalary)), Optional::get)));
//		System.out.println(result);

//		Map<String, Majdoor> result = details.stream().collect(Collectors.groupingBy(Majdoor::getDepartment, Collectors
//				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Majdoor::getSalary)), Optional::get)));
//
//		System.out.println(result);

		// Find the Total Majdoor
//		Long output = details.stream().collect(Collectors.counting());
//		System.out.println(output);

		// find the Total Majdoor Department Wise
//		Map<String, Long> output = details.stream().collect(Collectors.groupingBy(Majdoor::getDepartment, Collectors.counting()));
//		System.out.println(output);
	}

}
