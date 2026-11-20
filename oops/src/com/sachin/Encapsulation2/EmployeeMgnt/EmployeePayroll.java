package com.sachin.Encapsulation2.EmployeeMgnt;

public class EmployeePayroll {

	public static void main(String[] args) {
		Employee emp = new Employee("EMP101", "Sachin", 15220, "java Backend");

		// Salary increment
		emp.increseSalary(10);

		// salary Deduction
		emp.deductionSalary(5000);

		// promotion
		emp.promote("Senior Java Developer", 755550);

		// Employee Information

		System.out.println("Employee ID : " + emp.getEmployeeId());

		System.out.println("Employee Name: " + emp.getEmployeeName());

		System.out.println("Department: " + emp.getDepartment());

		System.out.println("Final Salary: " + emp.getSalary());
	}

}
