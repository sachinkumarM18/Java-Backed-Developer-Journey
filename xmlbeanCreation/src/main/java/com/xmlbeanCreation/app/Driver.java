package com.xmlbeanCreation.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlbeanCreation.service.OrderService;

public class Driver {

	public static void main(String[] args) {
		String config = "bean.xml";
		// Step 1: Create Spring IoC Container
		ApplicationContext iocContext = new ClassPathXmlApplicationContext(config);

		// Step 2: Retrieve OrderService Bean
		OrderService orderService = iocContext.getBean(OrderService.class);
		// Step 3: Place Order
		orderService.placeOrder();
	}

}
