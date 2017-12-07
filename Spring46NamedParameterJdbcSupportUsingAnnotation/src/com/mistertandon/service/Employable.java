package com.mistertandon.service;

import java.util.List;

import com.mistertandon.model.Employee;

public interface Employable {

	public abstract void createEmployeeE(Employee employee);

	public abstract Employee getEmployeeByIdE(int id);

	public abstract void deleteEmployeeByIdE(int id);

	public abstract void updateEmployeeEmailByIdE(String emailId, int employeeId);

	public List<Employee> getAllEmployeesDetailsE();
}
