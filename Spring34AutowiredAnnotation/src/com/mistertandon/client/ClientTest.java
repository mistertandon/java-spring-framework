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

			System.out.println("\nEmployee Information :\n");
			System.out.println("Employee Id: " + employeeObj.getId());
			System.out.println("Employee Name: " + employeeObj.getName());

			PanCard panCardObj = employeeObj.getPanCardObj();

			if (panCardObj != null) {

				System.out.println("\nPan Card Information :\n");

				System.out.println("Pan Card holder name: " + panCardObj.getPanHolderNumber());
				System.out.println("Pan Card Number: " + panCardObj.getPanNumber());
			} else {
				System.out.println("Employee Pan Card information is not available.");
			}

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
