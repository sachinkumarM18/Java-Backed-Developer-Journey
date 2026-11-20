package com.kodewala.gettersetter1;

/*
class Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
*/

class Employee{
	private double salary = 50000;

	
	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Invalid Salary");
		}
		
	}
	
	public double getSalary() {
		return salary;
	}

	
}



public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setSalary(750000);
		System.out.println(emp.getSalary());
	}

}
