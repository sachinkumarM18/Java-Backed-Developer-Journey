package com.sachin.Abstract.revision1;

abstract class Employee {
	String name;

	Employee(String name) {
		this.name = name;
	}

	// Common Implementation
	void login() {
		System.out.println(name + " logged In");
	}

	// Common Implementation
	void logout() {
		System.out.println(name + " logged Out");
	}

	// Different Implementation for each employee
	abstract void work();
}
