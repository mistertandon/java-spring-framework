package com.mistertandon.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.model.PanCard;

public class TestClass {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Employee employeeObj = abstractApplicationContextObj.getBean("EmployeeBC", Employee.class);

			System.out.println("\nEmployee Id: " + employeeObj.getEmployeeId());
			System.out.println("Employee Name: " + employeeObj.getEmployeeName());
			System.out.println("Employee Email Id: " + employeeObj.getEmployeeEmailId());

			PanCard panCardObj = employeeObj.getPanCardObj();
			System.out.println("\nPan Card number: " + panCardObj.getPanCardNumber());
			System.out.println("Pan Card holder name: " + panCardObj.getPanCardHolderName());
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}
	}

}
