package com.mistertandon.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;

public class ClientTest {

	public static void main(String[] args) throws Exception {

		ApplicationContext applicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		Employee employeeObj = applicationContextObj.getBean("employee", Employee.class);

		System.out.println(
				"\nCase A: Getting Object of Employee type after using setter function (Scope defined as Singleton) ->");

		employeeObj.setEmployeeId(104981);
		employeeObj.setEmployeeName("Parvesh Tandon");
		System.out.println("Property employeeId value: " + employeeObj.getEmployeeId());
		System.out.println("Property employeeName value: " + employeeObj.getEmployeeName());

		System.out.println(
				"\nCase A: Getting Object of Employee type without using setter function (Scope defined as Singleton) ->");

		System.out.println("Property employeeId value: " + employeeObj.getEmployeeId());
		System.out.println("Property employeeName value: " + employeeObj.getEmployeeName());

	}

}
