package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mistertandon.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext applicationContextObj = null;

		try {

			/**
			 * Following is the way using file ROOT path. applicationContextObj = new
			 * FileSystemXmlApplicationContext(
			 * "C:\\Users\\pt250154\\Desktop\\springCore\\SpringApplicationContextDemo\\src\\applicationContext.xml");
			 */
			
			applicationContextObj = new FileSystemXmlApplicationContext("src\\applicationContext.xml");

			Employee employeeObj = applicationContextObj.getBean("employee", Employee.class);

			System.out.println("\n===========================================================\n");
			System.out.println(
					"Case C: How we can access Bean XML properties using FileSystemXmlApplicationContext method ->");

			System.out.println("Property EmployeeId value: " + employeeObj.getEmployeeId());
			System.out.println("Property EmployeeName value: " + employeeObj.getEmployeeName());
		} catch (BeansException e) {

		} finally {

			if (applicationContextObj != null)
				((AbstractApplicationContext) applicationContextObj).close();
		}

	}

}
