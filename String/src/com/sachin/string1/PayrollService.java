package com.sachin.string1;

public class PayrollService {

	public static void main(String[] args) {
		String salary = "500000";
		salary = addCurrency(salary);
		System.out.println("Salary : " + salary);
	}

	static String addCurrency(String salary) {
		return "₹" + salary;
	}

}
