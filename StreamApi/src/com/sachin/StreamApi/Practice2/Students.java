package com.sachin.StreamApi.Practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Students {
	int id;
	String name;
	String department;
	int salary;

	public Students(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
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

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		List<Students> data = Arrays.asList(new Students(120, "Rahul", "AIDS", 55000),
				new Students(156, "Sujit", "EEE", 78000), new Students(126, "Rishbh", "CSE", 65655),
				new Students(128, "Rohit", "CSE", 47856), new Students(131, "Sachin", "AIDS", 98642),
				new Students(120, "Ravish", "AIDS", 86562), new Students(156, "Rakesh", "EEE", 56324),
				new Students(126, "Nikhil", "CSE", 46589), new Students(128, "Shyam", "CSE", 89645),
				new Students(131, "Ritesh", "AIDS", 69645));

//		int totalSalary = data.stream().mapToInt(Students::getSalary).sum();
//		System.out.println("Total Salary of All Students : " + totalSalary);

		// Find the Average of Salary
//		double averageSalary = data.stream().mapToInt(Students::getSalary).average().orElse(0);
//		System.out.println(averageSalary);

		// Salary GreaterThan Average Salary
//		data.stream().filter(salary -> salary.getSalary() > averageSalary)
//				.map(stu -> stu.getName() + " : " + stu.getSalary()).forEach(e -> System.out.println(e));

		// Find Department Wise MaxSalary and Min Salary

//		Map<String, Optional<Students>> salary = data.stream().collect(Collectors.groupingBy(Students::getDepartment,
//				Collectors.maxBy(Comparator.comparingInt(Students::getSalary))));
//		System.out.println(salary);

//		salary.forEach((department, employee) -> System.out
//				.println(department + " : " + employee.get().getName() + " " + employee.get().getSalary()));
		// Stream<Object> salary2=data.stream().filter(stu -> stu.getSalary() ==
		// salary).map(stu -> stu.getName() + " , " + stu.getDepartment() + " , " +
		// stu.getSalary());

		// Find the Highest Salary of CSE Department
		Students HighestPaid = data.stream().filter(e -> e.getDepartment().equals("AIDS"))
				.max(Comparator.comparingInt(Students::getSalary)).orElse(null);
		System.out.println(HighestPaid.getName() + " , " + HighestPaid.getSalary());
	}

}
