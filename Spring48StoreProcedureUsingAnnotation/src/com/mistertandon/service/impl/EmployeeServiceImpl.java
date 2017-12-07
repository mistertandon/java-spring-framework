package com.mistertandon.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mistertandon.dao.EmployeeDao;
import com.mistertandon.model.Employee;
import com.mistertandon.service.Employable;

@Service("employeeServiceObj")
public class EmployeeServiceImpl implements Employable {

	@Autowired
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
