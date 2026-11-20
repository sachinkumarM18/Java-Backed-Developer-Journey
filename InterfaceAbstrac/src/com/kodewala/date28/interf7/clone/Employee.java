package com.kodewala.date28.interf7.clone;

class Employee implements Cloneable {
	String name;

	Employee(String name) {
		this.name = name;
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}
