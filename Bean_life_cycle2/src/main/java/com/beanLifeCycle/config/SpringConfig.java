package com.beanLifeCycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.beanLifeCycle.pojo.EmployeeService;

@Configuration
@ComponentScan("com.beanLifeCycle")
public class SpringConfig {

	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
}
