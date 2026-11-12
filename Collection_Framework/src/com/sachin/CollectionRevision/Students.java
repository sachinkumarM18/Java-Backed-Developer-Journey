package com.sachin.CollectionRevision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Students {
	private int id;
	private String name;
	private int marks;

	Students(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String toString() {
		return "Students " + " id : " + id + "," + " name : " + name + "," + " marks : " + marks;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(Integer.valueOf(id), Integer.valueOf(marks), name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Students)) {
//			return false;
//		}
//		Students other = (Students) obj;
//		return id == other.id && marks == other.marks && Objects.equals(name, other.name);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(id,name,marks);
	}
	
	@Override 
	public boolean equals(Object obj) {
		Students s =(Students) obj;
		return id == s.id && Objects.equals(name, s.name);
	}
	public static void main(String[] args) {
		Set<Students> studentsDetails = new HashSet<>();
		Students s1 = new Students(131, "Sachin", 85);
		Students s2 = new Students(131, "Jatin", 90);
		Students s3 = new Students(51, "Parvez", 95);
		Students s4 = new Students(181, "Sachin", 85);
		Students s5 = new Students(151, "Abahy", 90);
		Students s6 = new Students(141, "Shyam", 80);

		studentsDetails.add(s1);
		studentsDetails.add(s2);
		studentsDetails.add(s3);
		studentsDetails.add(s4);
		studentsDetails.add(s5);
		studentsDetails.add(s6);

		// System.out.println(studentsDetails.contains(s6));
		System.out.println(studentsDetails.size());
		Iterator<Students> itr = studentsDetails.iterator();
		while (itr.hasNext()) {
			Students students = itr.next();
			if (students.getMarks() > 88) {
				itr.remove();
			} else {
				System.out.println(students);
			}

		}
	}

}
