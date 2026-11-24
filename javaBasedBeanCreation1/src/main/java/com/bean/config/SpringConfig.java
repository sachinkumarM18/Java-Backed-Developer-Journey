package com.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.student.Student;

@Configuration
public class SpringConfig {
	@Bean("stu1")
	public Student createStudent() {
		Student student = new Student();
		student.setName("Rohit");
		student.setRollNum("22CS131");
		student.setBranch("CSE");
		return student;
	}
	
	@Bean("stu2")
	public Student createStudent2() {
		Student student = new Student();
		student.setName("Vikash");
		student.setRollNum("22CS101");
		student.setBranch("EEE");
		return student; 
	}
}
