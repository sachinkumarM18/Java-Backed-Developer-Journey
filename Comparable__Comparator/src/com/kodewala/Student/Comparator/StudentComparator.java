package com.kodewala.Student.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	// Short by Price
//	@Override
//	public int compare(Student s1, Student s2) {
//		int result = Integer.compare(s1.studentId, s2.studentId);
//		return result;
//	}

	
	// Short by Name
	@Override
	public int compare(Student s1, Student s2) {
		int result = s1.StudentName.compareTo(s2.StudentName);   
		return result;
	}
}
