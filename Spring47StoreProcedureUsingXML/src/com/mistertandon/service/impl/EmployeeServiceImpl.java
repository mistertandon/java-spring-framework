package com.mistertandon.service.impl;

import com.mistertandon.dao.EmployeeDao;
import com.mistertandon.model.Employee;
import com.mistertandon.service.Employable;

public class EmployeeServiceImpl implements Employable {

	private EmployeeDao employeeDaoObj;

	public EmployeeDao getEmployeeDaoObj() {
		return employeeDaoObj;
	}

	public void setEmployeeDaoObj(EmployeeDao employeeDaoObj) {
		this.employeeDaoObj = employeeDaoObj;
	}

	@Override
	public Employee getEmployeeNameAndSalaryById(int employeeId) {

		return employeeDaoObj.getEmployeeNameAndSalaryById(employeeId);
	}

}
