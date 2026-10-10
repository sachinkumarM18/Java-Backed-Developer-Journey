package com.sachin.Interface.Cloning; 

class Employee implements Cloneable {
	protected String name;
	protected String location;

	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Sachin", "Bihar");
		Employee e2 = (Employee) e1.clone(); // Copied the object

		System.out.println(e1.name + " " + e1.location);
		System.out.println(e2.location + " " + e2.name);
	}

}
