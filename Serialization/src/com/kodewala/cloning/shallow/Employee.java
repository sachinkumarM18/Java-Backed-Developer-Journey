package com.kodewala.cloning.shallow;

class Employee implements Cloneable {
	String name;
	Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// Cloning the employee
		Employee emp = (Employee) super.clone();
		// cloning the addressing by deep cloning
		emp.address = this.address.clone();
		return emp;
	}

}
