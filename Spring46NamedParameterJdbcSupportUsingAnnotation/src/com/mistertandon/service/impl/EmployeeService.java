package com.mistertandon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;
import com.mistertandon.service.Employable;

@Service("employeeServiceObj")
public class EmployeeService implements Employable {

	@Autowired
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
