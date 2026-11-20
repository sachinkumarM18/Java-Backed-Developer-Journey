package com.sachin.cloning;

class Address implements Cloneable {
	String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;
	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}

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
		// Cloning the address(deep Cloning)
		emp.address = this.address.clone();
		
		return emp;
	}
}

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Btm Layout"); // in case of shallow cloning this remains shared(common)
		Employee e1 = new Employee("Rohit", address);
		Employee e2 = (Employee) e1.clone();

		// Modifying the line 1 of address
		e2.address.line1 = "Marathalli";

		//

		System.out.println("Original Object : " + e1.name);
		System.out.println("Original Object : " + e1.address.line1);

		System.out.println("Copy Object : " + e2.name);
		System.out.println("Copy Object : " + e2.address.line1);
	}

}
