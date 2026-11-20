package com.kodewala.Revision;

import java.util.Comparator;

public class comparebymarks implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int result = s1.name.compareTo(s2.name);
		if (result == 0) {
			return Integer.compare(s1.marks, s2.marks);
		}
		return result;
	}
	
}
