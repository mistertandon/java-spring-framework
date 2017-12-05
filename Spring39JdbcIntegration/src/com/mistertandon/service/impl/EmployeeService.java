package com.mistertandon.service.impl;

import java.util.List;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;
import com.mistertanon.service.Employable;

public class EmployeeService implements Employable {

	private EmployeeDAO employeeDAOObj;

	public EmployeeDAO getEmployeeDAOObj() {

		return employeeDAOObj;
	}

	public void setEmployeeDAOObj(EmployeeDAO employeeDAOObj) {

		this.employeeDAOObj = employeeDAOObj;
	}

	@Override
	public void createEmployeeE(Employee employee) {

		employeeDAOObj.createEmployeeEDAO(employee);
	}

	@Override
	public Employee getEmployeeByIdE(int id) {

		return employeeDAOObj.getEmployeeByIdEDAO(id);
	}

	@Override
	public void deleteEmployeeByIdE(int id) {

		employeeDAOObj.deleteEmployeeByIdEDAO(id);
	}

	@Override
	public void updateEmployeeEmailByIdE(String emailId, int employeeId) {

		employeeDAOObj.updateEmployeeEmailByIdEDAO(emailId, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesDetailsE() {

		return employeeDAOObj.getAllEmployeesDetailsEDAO();
	}

}
