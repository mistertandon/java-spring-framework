package com.mistertandon.dao;

import com.mistertandon.model.Employee;

public interface EmployeeDao {

	public abstract Employee getEmployeeNameAndSalaryById(int employeeId);
}
