package com.mistertandon.client;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.service.impl.EmployeeServiceImpl;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		try {
			abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

			EmployeeServiceImpl employeeServiceImplObj = abstractApplicationContextObj.getBean("EmployeeServiceImplBC",
					EmployeeServiceImpl.class);

			Employee employeeObj = employeeServiceImplObj.getEmployeeNameAndSalaryById(2);

			System.out.println("Employee information retrieved using Store Procedure: \n");

			System.out.println("Employee Name: " + employeeObj.getName());
			System.out.println("Employee Salary: " + employeeObj.getSalary());

		} catch (BeansException e) {

			e.printStackTrace();
		} finally {

			abstractApplicationContextObj.close();
		}
	}

}
