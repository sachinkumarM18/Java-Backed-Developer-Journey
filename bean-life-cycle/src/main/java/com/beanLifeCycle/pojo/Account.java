package com.beanLifeCycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Account implements InitializingBean, DisposableBean {
	private String accountNo;
	private String name;

	public Account(String accountNo, String name) {
		super();
		System.out.println("1. Constructor Called");
		this.accountNo = accountNo;
		this.name = name;
	}

	@PostConstruct
	public void init() {
		System.out.println("2. Initialization Called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" 3. Account.afterPropertiesSet()...");
	}

	public void openAccount() {
		System.out.println("4. Account Service is Running..");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("5. Doing Cleanup");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("6. Account Destroy().......");

	}

}
