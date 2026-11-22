package com.beanLifeCycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeService implements InitializingBean, DisposableBean {

	public EmployeeService() {
		System.out.println(" 1. Constructor : Bean Created.....");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("4. @PostConstruct : Initialization");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("5. AfterPropertiesSet(): Initialization");
	}

	public void customInit() {
		System.out.println("6. Custom Init Method");
	}

	public void work() {
		System.out.println("Employee Service is Ready!..");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("8. @PreDestrow : Cleanup");
	}

	@Override
	public void destroy() {
		System.out.println("9. destroy(): Cleanup");
	}

	public void customDestroy() {
		System.out.println("10. Custom Destroy Method..");
	}

}
