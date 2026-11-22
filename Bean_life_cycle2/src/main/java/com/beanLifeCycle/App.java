package com.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beanLifeCycle.config.SpringConfig;
import com.beanLifeCycle.pojo.EmployeeService;



public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeService service = contex.getBean(EmployeeService.class);
		service.work();
		contex.close();
	}
}
