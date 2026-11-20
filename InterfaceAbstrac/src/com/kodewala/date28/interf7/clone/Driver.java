package com.kodewala.date28.interf7.clone;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Sachin");
		Employee e2 = e1.clone();

		System.out.println("Before Change");
		System.out.println("e1 Name : " + e1.name);
		System.out.println("e2 Name : " + e2.name);

		System.out.println();

		e2.name = "Abhi";

		System.out.println("After Change");
		System.out.println("e1 Name : " + e1.name);
		System.out.println("e2 Name : " + e2.name);
	}

}
