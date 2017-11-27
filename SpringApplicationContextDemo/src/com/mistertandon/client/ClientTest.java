package com.mistertandon.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext applicationContextObj = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employeeObj = applicationContextObj.getBean("employee", Employee.class);

		System.out.println("\n===========================================================\n");
		System.out.println("Case A: How we can access Bean XML properties using ApplicationContext ->");

		System.out.println("Property EmployeeId value: " + employeeObj.getEmployeeId());
		System.out.println("Property EmployeeName value: " + employeeObj.getEmployeeName());

		((AbstractApplicationContext) applicationContextObj).close();
	}

}
