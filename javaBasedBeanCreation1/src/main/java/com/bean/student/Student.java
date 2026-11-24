package com.bean.student;

public class Student {
	private String name;
	private String rollNum;
	private String branch;

	public void dispaly() {
		System.out.println("Student Bean has been Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum; 
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum; 
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", branch=" + branch + "]";
	}

}
