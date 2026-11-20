package com.kodewala.Student.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		Student students1 = new Student(111, "Virat");
		Student students2 = new Student(103, "Rohit");
		Student students3 = new Student(102, "ABD");
		Student students4 = new Student(205, "Dhoni");

		List<Student> students = new ArrayList<Student>();
		students.add(students1);
		students.add(students2);
		students.add(students3);
		students.add(students4);

		Collections.sort(students , new StudentComparator());

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			System.out.println(s.studentId + " , " + s.StudentName);
		}
	}

}
