package com.sachin.Interface.Cloning;

import java.util.Objects;

class Student implements Cloneable {
	protected String name;
	protected String location;
	protected int age;
	protected String department;

	public Student(String name, String location, int age, String department) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.department = department;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("parvez", "Delhi", 30, "ECE");
		System.out.println(s1.name);
		System.out.println(s1.location);
		System.out.println(s1.age);
		System.out.println(s1.department);

		System.out.println(s1);
		
		Student s2 = (Student) s1.clone();
		
		System.out.println(s2.name);
		System.out.println(s2.location);
		System.out.println(s2.age);
		System.out.println(s2.department);

	}

}
