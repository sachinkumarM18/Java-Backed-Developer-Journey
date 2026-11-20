
package com.kodewala.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "name=" + name + " , marks=" + marks;
	}

	public static void main(String[] args) {

		Set<Student> marks = new HashSet<>();

		Student s1 = new Student("Sachin", 80);
		Student s2 = new Student("Parvez", 90);
		Student s5 = new Student("Jatin", 80);
		Student s3 = new Student("Jatin", 70);
		Student s4 = new Student("Nitin", 65);
		Student s6 = new Student("Jatin", 90);


		marks.add(s1);
		marks.add(s2);
		marks.add(s3);
		marks.add(s4);
		marks.add(s5);
		marks.add(s6);


		// Convert HashSet into ArrayList
		List<Student> sortmarks = new ArrayList<>(marks);
		//Collections.sort(sortmarks , new comparebymarks());
		// Sort students by marks - ascending order
//		Collections.sort(sortmarks,(student2, student3) -> Integer.compare(student2.marks, student3.marks));
//		Collections.sort(sortmarks, (student1, student2) -> Integer.compare(student1.marks, student2.marks));

//		Collections.sort(sortmarks,(s1 , s2) ->{
//			int result = s1.name.compareTo(s2.name);
//		});
		
//		Collections.sort(sortmarks, (s1, s2) -> {
//
//		    int result = s1.name.compareTo(s2.name);
//
//		    if (result == 0) {
//		        return Integer.compare(s1.marks, s2.marks);
//		    }
//
//		    return result;
//		});
		
		// Print sorted students
		for (Student student : sortmarks) {
			System.out.println(student);
		}
	}
}
