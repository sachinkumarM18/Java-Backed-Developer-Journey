package com.sachin.stringBuilder;

public class ReportGenerator {

	public static void main(String[] args) {
		StringBuilder report = new StringBuilder("Employee");
		update(report);
		System.out.println(report);
	}

	static void update(StringBuilder report) {
		report.append("-2003");
	}
}
