package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.model.PanCard;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Employee employeeObj = abstractApplicationContextObj.getBean("EmployeeBC", Employee.class);

			System.out.println("\nEmployee Information: ");
			System.out.println("Employee ID: " + employeeObj.getId());
			System.out.println("Employee Name: " + employeeObj.getName());

			PanCard panCardObj = employeeObj.getPanCardObj();

			if (panCardObj != null) {

				System.out.println("\nEmployee Pan Card Information: ");
				System.out.println("PanCard number: " + panCardObj.getPanNumber());
				System.out.println("PanCard holder name: " + panCardObj.getPanHolderName());
			} else {

				System.out.println("\nEmployee Pan Card Information is not available.");
			}
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}
	}
}
