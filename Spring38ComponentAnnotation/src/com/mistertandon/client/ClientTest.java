package com.mistertandon.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.model.PanCard;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		Employee employeeObj = abstractApplicationContextObj.getBean("employeeObj", Employee.class);

		System.out.println("\nEmployee Information: ");
		System.out.println("Employee id: " + employeeObj.getId());
		System.out.println("Employee name: " + employeeObj.getName());

		System.out.println("\nEmployee PanCard Information: ");

		PanCard panCardObj = employeeObj.getPanCardObj();
		System.out.println("Pan card number: " + panCardObj.getPanNumber());
		System.out.println("Pan card holder name: " + panCardObj.getPanHolderName());
	}

}
