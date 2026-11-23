package com.beanScope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beanScope.bean.Delivery;

@Configuration
public class DeliveryConfig {

	@Bean
	public Delivery delivery() {
		return new Delivery("ORD101", "Pizza");
	}
}
