package com.kodewala.cloning.shallow;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Btm 2nd Stage");
		Employee e1 = new Employee("ABhi", address);

		Employee e2 = (Employee) e1.clone();
 
		e2.address.line1 = "Test Stage";

		System.out.println("Original Obj : " + e1.name);
		System.out.println("Original Obj :" + e1.address.line1);

		System.out.println("Clone Obj : " + e2.name);
		System.out.println("Clone Obj : " + e2.address.line1);
	}

}
