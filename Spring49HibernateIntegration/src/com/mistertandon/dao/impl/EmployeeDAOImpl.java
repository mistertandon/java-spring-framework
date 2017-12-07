package com.mistertandon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createEmployeeEDAO(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeByIdEDAO(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeByIdEDAO(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeEmailByIdEDAO(String emailId, int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployeesDetailsEDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
