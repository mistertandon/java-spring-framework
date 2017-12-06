package com.mistertandon.service;

import java.util.List;

import com.mistertandon.model.Employee;

public interface Employable {

	public abstract void createEmployee(Employee employeeObj);

	public abstract Employee getEmployeeById(int id);

	public abstract List<Employee> getAllEmployeesList();

	public abstract void updateEmployeeEmailIdById(String emailId, int id);

	public abstract void deleteEmployeeById(int id);
}
