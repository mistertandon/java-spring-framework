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

	private DataSource dataSourceObj;

	private JdbcTemplate jdbcTemplateObj;

	public DataSource getDataSourceObj() {
		return dataSourceObj;
	}

	public void setDataSourceObj(DataSource dataSourceObj) {

		this.dataSourceObj = dataSourceObj;
		jdbcTemplateObj = new JdbcTemplate(dataSourceObj);
	}

	/**
	 * Reference code: #createEmployeeEDAO
	 */
	@Override
	public void createEmployeeEDAO(Employee employee) {

		int addedEmpId = 0;

		String sql = null;

		sql = "INSERT INTO `employee` (`name`, `email`, `gender`, `salary`) VALUES (?,?,?,?)";

		addedEmpId = jdbcTemplateObj.update(sql,
				new Object[] { employee.getName(), employee.getEmail(), employee.getGender(), employee.getSalary() });

		if (addedEmpId > 0) {
			System.out.println("Employee information has been save in database.");
		} else {
			System.out.println("Something went wrong please try after some time.");
		}
	}

	/*
	 * Reference code: #createEmployeeEDAO
	 * 
	 * Following function definition can also be used to create new Employee record
	 * in `employee` table.
	 * 
	 * @Override public void createEmployeeEDAO(Employee employee) {
	 * 
	 * Connection connectionObj = null; PreparedStatement psObj = null; String sql =
	 * null; int prepareStatementResponse = 0;
	 * 
	 * try { connectionObj = dataSourceObj.getConnection();
	 * 
	 * sql =
	 * "INSERT INTO `employee` (`name`, `email`, `gender`, `salary`) VALUES (?,?,?,?)"
	 * ;
	 * 
	 * psObj = connectionObj.prepareStatement(sql); psObj.setString(1,
	 * employee.getName()); psObj.setString(2, employee.getEmail());
	 * psObj.setString(3, employee.getGender()); psObj.setDouble(4,
	 * employee.getSalary());
	 * 
	 * prepareStatementResponse = psObj.executeUpdate();
	 * 
	 * if (prepareStatementResponse > 0) {
	 * 
	 * System.out.println("Employee information has been save in database."); } else
	 * { System.out.println("Something went wrong please try after some time."); }
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } finally {
	 * 
	 * if (connectionObj != null) { try { connectionObj.close(); } catch
	 * (SQLException e) {
	 * 
	 * e.printStackTrace(); } } } }
	 */

	@Override
	public Employee getEmployeeByIdEDAO(int id) {

		String sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE id=?";

		Employee employeeObj = jdbcTemplateObj.queryForObject(sql, new EmployeeRowMapper(), id);

		return employeeObj;
	}

	@Override
	public void deleteEmployeeByIdEDAO(int id) {

		String sql = null;
		int returnedId = 0;

		sql = "DELETE FROM `employee` WHERE `employee`.`id` = ?";

		returnedId = jdbcTemplateObj.update(sql, id);

		if (returnedId > 0) {
			System.out.println("Employee information has been deleted.");
		}
	}

	@Override
	public void updateEmployeeEmailByIdEDAO(String emailId, int employeeId) {

		String sql = null;
		int returnedId = 0;

		sql = "UPDATE `employee` SET `email` = ? WHERE `employee`.`id` = ?";

		returnedId = jdbcTemplateObj.update(sql, emailId, employeeId);

		if (returnedId > 0) {
			System.out.println("Email id has been updated.");
		}
	}

	@Override
	public List<Employee> getAllEmployeesDetailsEDAO() {

		String sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE 1";

		return jdbcTemplateObj.query(sql, new EmployeeRowMapper());

	}

}
