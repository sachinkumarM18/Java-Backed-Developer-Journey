package com.bean.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.config.SpringConfig;

public class App {
	public static void main(String[] args) {
		System.out.println("Creating Bean With Java");

		ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student1 = (Student) iocContainer.getBean("stu2");
		Student student2 = (Student) iocContainer.getBean("stu1");
		student1.dispaly();

		String result1 = student1.toString();
		System.out.println(result1);

		student2.dispaly();
		String result2 = student2.toString();
		System.out.println(result2);
	}
}
