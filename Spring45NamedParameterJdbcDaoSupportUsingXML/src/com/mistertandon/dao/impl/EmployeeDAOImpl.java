package com.mistertandon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;


public class EmployeeDAOImpl extends NamedParameterJdbcDaoSupport implements EmployeeDAO {

	@Override
	public void createEmployeeEDAO(Employee employee) {

		int addedEmpId = 0;
		String sql = null;

		sql = "INSERT INTO `employee` (`name`, `email`, `gender`, `salary`) VALUES (:name, :email, :gender, :salary)";

		Map<String, Object> placeholderMap = new HashMap<>();

		placeholderMap.put("name", employee.getName());
		placeholderMap.put("email", employee.getEmail());
		placeholderMap.put("gender", employee.getGender());
		placeholderMap.put("salary", employee.getSalary());

		addedEmpId = getNamedParameterJdbcTemplate().update(sql, placeholderMap);

		if (addedEmpId > 0) {
			System.out.println("Employee information has been save in database.");
		} else {
			System.out.println("Something went wrong please try after some time.");
		}

	}

	@Override
	public Employee getEmployeeByIdEDAO(int id) {

		String sql = null;

		sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE id=:employeeId";

		MapSqlParameterSource mapSqlParameterSourceObj = new MapSqlParameterSource();
		mapSqlParameterSourceObj.addValue("employeeId", id);

		/*
		 * Following is additional way of passing parameter
		 * 
		 * Map<String, Object> inputMap = new HashMap<>(); inputMap.put("employeeId",
		 * id);
		 */

		Employee employeeObj = getNamedParameterJdbcTemplate().queryForObject(sql, mapSqlParameterSourceObj,
				new EmployeeRowMapper());

		return employeeObj;
	}

	@Override
	public void deleteEmployeeByIdEDAO(int id) {

		String sql = null;
		int returnedId = 0;

		sql = "DELETE FROM `employee` WHERE `employee`.`id` = :employeeId";

		Map<String, Object> placeHolderObj = new HashMap<>();
		placeHolderObj.put("employeeId", id);

		returnedId = getNamedParameterJdbcTemplate().update(sql, placeHolderObj);

		if (returnedId > 0) {
			System.out.println("Employee information has been deleted.");
		}

	}

	@Override
	public void updateEmployeeEmailByIdEDAO(String emailId, int employeeId) {

		String sql = null;
		int returnedId = 0;
		Map<String, Object> placeholderObj = new HashMap();

		sql = "UPDATE `employee` SET `email` = :employeeEmailId WHERE `employee`.`id` = :employeeId";

		placeholderObj.put("employeeEmailId", emailId);
		placeholderObj.put("employeeId", employeeId);

		returnedId = getNamedParameterJdbcTemplate().update(sql, placeholderObj);

		if (returnedId > 0) {
			System.out.println("Email id has been updated.");
		} else {
			System.out.println("Something went wrong, please try after sometime.");
		}

	}

	@Override
	public List<Employee> getAllEmployeesDetailsEDAO() {

		String sql = null;

		sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE 1";

		return getNamedParameterJdbcTemplate().query(sql, new EmployeeRowMapper());

	}

}
