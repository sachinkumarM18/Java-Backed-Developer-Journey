package com.sachin.constructor.object;

class StudentResult {
	private int rollNumber;
	private String name;
	private double marks;
	private String grade;

	public StudentResult(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;

		if (marks >= 90) {
			grade = "A+";
		} else if (marks >= 80) {
			grade = "A";
		} else if (marks >= 70) {
			grade = "B";
		} else {
			grade = "fail";
		}
	}

	public void display() {

		System.out.println("-----------------------");
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Name        : " + name);
		System.out.println("Marks       : " + marks);
		System.out.println("Grade       : " + grade);
	}

}

public class Driver3 {

	public static void main(String[] args) {
		StudentResult result1 = new StudentResult(131, "Sachin", 55);
		StudentResult result2 = new StudentResult(120, "Rahul", 98);

		result1.display();
		result2.display();

	}

}
