package com.beanLifeCycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.beanLifeCycle.pojo.Account;

@Configuration
@ComponentScan(basePackages = "com.beanLifeCycle")
public class SpringConfig {

	@Bean
	@Scope("prototype")
	public Account account() {
		Account account = new Account("2822565566", "Sachin Kumar");
		return account;
	}
}
