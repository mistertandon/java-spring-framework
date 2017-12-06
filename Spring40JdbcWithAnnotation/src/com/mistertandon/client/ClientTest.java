package com.mistertandon.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mistertandon.model.Employee;
import com.mistertandon.service.implementation.EmployeeService;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContextObj = null;

		abstractApplicationContextObj = new ClassPathXmlApplicationContext("Beans.xml");

		EmployeeService employeeServiceObj = abstractApplicationContextObj.getBean("employeeServiceObj",
				EmployeeService.class);

		 createEmployee(employeeServiceObj);
		// getEmployeeById(employeeServiceObj, 7);
		// getEmployeesList(employeeServiceObj);
		// updateEmployeeEmailIdById(employeeServiceObj, "erbipin@gmail.com", 7);
		// deleteEmployeeById(employeeServiceObj, 7);
	}

	private static void deleteEmployeeById(EmployeeService employeeServiceObj, int id) {

		employeeServiceObj.deleteEmployeeById(id);
	}

	private static void updateEmployeeEmailIdById(EmployeeService employeeServiceObj, String emailId, int id) {

		employeeServiceObj.updateEmployeeEmailIdById(emailId, id);
	}

	private static void getEmployeesList(EmployeeService employeeServiceObj) {

		List<Employee> employeeList = employeeServiceObj.getAllEmployeesList();

		for (Employee employeeObj : employeeList) {
			System.out.println("Employee Information: \n");
			System.out.println("Employee Name: " + employeeObj.getName());
			System.out.println("Employee Email: " + employeeObj.getEmail());
			System.out.println("Employee Gender: " + employeeObj.getGender());
			System.out.println("Employee Salay: " + employeeObj.getSalary());
		}
	}

	private static void createEmployee(EmployeeService employeeServiceObj) {

		Employee employeeObj = new Employee();

		employeeObj.setName("bipin");
		employeeObj.setEmail("bipin@gmail.com");
		employeeObj.setGender("male");
		employeeObj.setSalary(200000.0);

		employeeServiceObj.createEmployee(employeeObj);
	}

	private static void getEmployeeById(EmployeeService employeeServiceObj, int id) {

		Employee employeeObj = employeeServiceObj.getEmployeeById(id);

		System.out.println("Employee Information: \n");
		System.out.println("Employee Name: " + employeeObj.getName());
		System.out.println("Employee Email: " + employeeObj.getEmail());
		System.out.println("Employee Gender: " + employeeObj.getGender());
		System.out.println("Employee Salay: " + employeeObj.getSalary());
	}
}
