package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beanScope.bean.Delivery;
import com.beanScope.config.DeliveryConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(DeliveryConfig.class);
		Delivery del = container.getBean(Delivery.class);
		del.displayDelivery();
	}
}
