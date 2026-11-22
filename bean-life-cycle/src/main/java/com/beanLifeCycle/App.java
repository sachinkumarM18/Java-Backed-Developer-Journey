package com.beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beanLifeCycle.config.SpringConfig;
import com.beanLifeCycle.pojo.AccountMgnt;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountMgnt account = container.getBean(AccountMgnt.class);
		account.info();

		AccountMgnt account1 = container.getBean(AccountMgnt.class);
		account1.info();
	}
}
