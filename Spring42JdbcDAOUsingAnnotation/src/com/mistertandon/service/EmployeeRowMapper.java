package com.mistertandon.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mistertandon.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int id) throws SQLException {

		Employee employeeObj = new Employee();

		employeeObj.setName(resultSet.getString("name"));
		employeeObj.setEmail(resultSet.getString("email"));
		employeeObj.setGender(resultSet.getString("gender"));
		employeeObj.setSalary(resultSet.getDouble("salary"));

		return employeeObj;
	}

}
