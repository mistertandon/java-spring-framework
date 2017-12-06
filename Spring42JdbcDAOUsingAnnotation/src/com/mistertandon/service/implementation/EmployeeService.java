package com.mistertandon.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;
import com.mistertandon.service.Employable;

@Service("employeeServiceObj")
public class EmployeeService implements Employable {
	
	@Autowired
	private EmployeeDAO employeeDAOObj;

	public void setEmployeeDAOObj(EmployeeDAO employeeDAOObj) {

		this.employeeDAOObj = employeeDAOObj;
	}

	@Override
	public void createEmployee(Employee employeeObj) {

		employeeDAOObj.createEmployee(employeeObj);
	}

	@Override
	public Employee getEmployeeById(int id) {

		return employeeDAOObj.getEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployeesList() {

		return employeeDAOObj.getAllEmployeesList();
	}

	@Override
	public void updateEmployeeEmailIdById(String emailId, int id) {

		employeeDAOObj.updateEmployeeEmailIdById(emailId, id);
	}

	@Override
	public void deleteEmployeeById(int id) {

		employeeDAOObj.deleteEmployeeById(id);
	}
}
