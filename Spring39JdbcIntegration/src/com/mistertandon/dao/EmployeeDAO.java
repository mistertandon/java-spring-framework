package com.mistertandon.dao;

import java.util.List;

import com.mistertandon.model.Employee;

public interface EmployeeDAO {

	public abstract void createEmployeeEDAO(Employee employee);

	public abstract Employee getEmployeeByIdEDAO(int id);

	public abstract void deleteEmployeeByIdEDAO(int id);

	public abstract void updateEmployeeEmailByIdEDAO(String emailId, int employeeId);

	public List<Employee> getAllEmployeesDetailsEDAO();
}
