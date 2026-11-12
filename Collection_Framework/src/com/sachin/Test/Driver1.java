package com.sachin.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	String name;
	int marks;
	int id;
	int number;

	Student(String name, int id, int number, int marks) {
		this.marks = marks;
		this.name = name;
		this.id = id;
		this.number = number;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return (obj instanceof Student && this.name.equals(s.name));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", id=" + id + ", number=" + number + "]";
	}

}

public class Driver1 {

	public static void main(String[] args) {
//		HashSet<String> string = new HashSet<String>();
//		string.add("Sachin");
//		string.add("Parvez");
//		string.add("Sachin");
//		System.out.println(string);

		Set<Student> details = new HashSet<Student>();

		Student s1 = new Student("Sachin", 101, 70, 80);
		Student s2 = new Student("Rohit", 100, 60, 70);
		Student s3 = new Student("Parvez", 104, 70, 70);
		Student s4 = new Student("Virat", 106, 80, 70);
		Student s5 = new Student("Sachin", 101, 70, 80);

		details.add(s2);
		details.add(s1);
		details.add(s3);
		details.add(s4);
		details.add(s5);
//		details.add();
//		details.add(new Student("Parvez", 60));
//		details.add(new Student("Sachin", 70));
		System.out.println(details);
		// System.out.println(details.size());
	}

}
