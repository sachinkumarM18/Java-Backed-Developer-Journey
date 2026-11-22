package com.beanLifeCycle.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("employeeService")) {
			System.out.println("3. Before Initialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("employeeService")) {
			System.out.println("7. After Initialization");
		}

		return bean; 
	}
}
