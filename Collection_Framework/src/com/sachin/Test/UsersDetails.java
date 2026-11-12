package com.sachin.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class UsersDetails {
	private int id;
	private String name;
	private double salary;
	private String department;

	UsersDetails(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	// Using Getter to get the value

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDeparment() {
		return department;
	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//
//		if (obj == null || getClass() != obj.getClass()) {
//			return false;
//		}
//
//		UsersDetails other = (UsersDetails) obj;
//		return id == other.id && salary == other.salary && Objects.equals(name, other.name)
//				&& Objects.equals(department, other.department);
//	}
	
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary, department);
	}

	@Override
	public String toString() {
		return "UsersDetails [id = " + id + ", name = " + name + ", salary = " + salary + ", department = " + department
				+ "]";
	}

	public static void main(String[] args) {

		Set<UsersDetails> users = new HashSet<>();
		UsersDetails user1 = new UsersDetails(101, "Shrwan", 50000, "Electrical");
		UsersDetails user2 = new UsersDetails(103, "Sonu", 55000, "ITI");
		UsersDetails user3 = new UsersDetails(103, "Sachin", 45000, "CSE");

		users.add(user1);
		users.add(user2);
		users.add(user3);

//		for (UsersDetails user : users) {
//			System.out.println(user);
//		}
		
		Iterator<UsersDetails> itr = users.iterator();
		while(itr.hasNext()) {
			UsersDetails user = itr.next();
			System.out.println(user);
		}
	}

}
