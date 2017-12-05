package com.mistertandon.client;

import java.util.List;

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

		// addEmployeeDetail(employeeServiceObj);
		// getEmployeeDetailById(employeeServiceObj, 1);
		// getAllEmployeeDetails(employeeServiceObj);
		// updateEmployeeEmailById(employeeServiceObj, "prabhash@gmail.com", 3);

		deleteEmployeeById(employeeServiceObj, 6);

		abstractApplicationContextObj.close();
	}

	private static void deleteEmployeeById(EmployeeService employeeServiceObj, int id) {

		employeeServiceObj.deleteEmployeeByIdE(id);
	}

	private static void updateEmployeeEmailById(EmployeeService employeeServiceObj, String updatedEmailId,
			int employeeId) {

		employeeServiceObj.updateEmployeeEmailByIdE(updatedEmailId, employeeId);
	}

	private static void addEmployeeDetail(EmployeeService employeeServiceObj) {

		Employee employeeObj = new Employee();

		employeeObj.setName("prabhashtandon");
		employeeObj.setEmail("prabhashtandon@gmail.com");
		employeeObj.setGender("Male");
		employeeObj.setSalary(170000.00);

		employeeServiceObj.createEmployeeE(employeeObj);
	}

	private static void getEmployeeDetailById(EmployeeService employeeServiceObj, int id) {

		Employee employeeObj = employeeServiceObj.getEmployeeByIdE(id);

		System.out.println("\nEmployee information:\n ");
		System.out.println("Employee Id: " + employeeObj.getId());
		System.out.println("Employee Name: " + employeeObj.getName());
		System.out.println("Employee Email Id: " + employeeObj.getEmail());
		System.out.println("Employee Gender: " + employeeObj.getGender());
		System.out.println("Employee Salay: " + employeeObj.getSalary());
	}

	private static void getAllEmployeeDetails(EmployeeService employeeServiceObj) {

		List<Employee> employeeList = employeeServiceObj.getAllEmployeesDetailsE();

		System.out.println("\nEmployee information:\n ");

		for (Employee employeeObj : employeeList) {

			System.out.println("Employee Id: " + employeeObj.getId());
			System.out.println("Employee Name: " + employeeObj.getName());
			System.out.println("Employee Email Id: " + employeeObj.getEmail());
			System.out.println("Employee Gender: " + employeeObj.getGender());
			System.out.println("Employee Salay: " + employeeObj.getSalary() + "\n");
		}
	}

}
