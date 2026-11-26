package finance.com.infosys.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import finance.com.infosys.Employee;

public class Driver {

	public static void main(String[] args) {
		// Create an Ioc Container
		String configPath = "beans.xml";
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(configPath);

		Employee employee = (Employee) iocContainer.getBean("emp2");
		System.out.println(employee.getName());
	}

}
