package com.kodewala.serialization.student;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private transient String password;
	public Student(int rollNo, String name, String password) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.password = password;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}
