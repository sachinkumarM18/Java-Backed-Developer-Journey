package com.beanLifeCycle.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AccountMgnt { // Single

	@Autowired
	
	Account account; // Prototype

	public void info() {
		System.out.println("Showing Information...");
		account.openAccount();
	}
}
