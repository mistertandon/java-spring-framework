package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			Employee employeeObj = abstractApplicationContextObj.getBean("EmployeeId", Employee.class);

			System.out.println("Following is the Employee Details: ");
			System.out.println("Employee id is: " + employeeObj.getId());
			System.out.println("Employee Name is: " + employeeObj.getName());
			System.out.println("Employee Gender is: " + employeeObj.getGender());
			System.out.println("Employee PAN No is: " + employeeObj.getPanNo());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			abstractApplicationContextObj.close();
		}

	}

}
