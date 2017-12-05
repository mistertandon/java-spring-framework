package com.mistertandon.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.service.impl.EmployeeService;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		EmployeeService employeeServiceObj = abstractApplicationContextObj.getBean("EmployeeServiceBC",
				EmployeeService.class);

		Employee employeeObj = new Employee();

		employeeObj.setName("Pra JI");
		employeeObj.setEmail("praji@gmail.com");
		employeeObj.setGender("Male");
		employeeObj.setSalary(170000.00);

		employeeServiceObj.createEmployeeE(employeeObj);
		abstractApplicationContextObj.close();

	}

}
