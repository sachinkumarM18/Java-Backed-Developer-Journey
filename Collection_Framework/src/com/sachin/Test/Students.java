package com.sachin.Test;

import java.util.TreeSet;

public class Students implements Comparable<Students> {
	private int studentId;
	private String name;
	private int marks;

	Students(int studentId, String name, int marks) {
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	// compare by Marks
//	@Override
//	public int compareTo(Students o) {
//		return Integer.compare(this.marks, o.marks);
//	}

	// Compare by Marks and then Id
//	@Override
//	public int compareTo(Students o) {
//		int result = Integer.compare(this.marks, o.marks);
//		if(result != 0) {
//			return result;
//		}
//		
//		return Integer.compare(this.studentId, o.studentId);
//	}

	// 1st Method to Compare with Marks Id and Name 
	
//	@Override
//	public int compareTo(Students o) {
//		int result = this.name.compareTo(o.name);
//		if (result != 0) {
//			return result;
//		} 
//
//		result = Integer.compare(this.studentId, o.studentId);
//		if (result != 0) {
//			return result;
//		}
//		return Integer.compare(this.marks, o.marks);
//	}

	@Override
	public int compareTo(Students o) {
		if (!this.name.equals(o.name)) {
			return this.name.compareTo(o.name);
		}

		if (this.studentId != o.studentId) {
			return Integer.compare(this.studentId, o.studentId);
		}

		return Integer.compare(this.marks, o.marks);
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		TreeSet<Students> students = new TreeSet<Students>();
		Students s1 = new Students(101, "Sachin", 85);
		Students s2 = new Students(121, "Jatin", 90);
		Students s3 = new Students(111, "Parvez", 98);
		Students s5 = new Students(131, "Akash", 90);
		Students s4 = new Students(141, "Shivam", 96);
		Students s6 = new Students(1021, "Sachin", 89);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);

		for (Students student : students) {
			System.out.println(student);
		}
	}

	

}
