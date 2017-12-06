package com.mistertandon.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;
import com.mistertandon.service.EmployeeRowMapper;

@Repository("employeeDAOObj")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplateObj;

	public void setDbcTemplateObj(JdbcTemplate jdbcTemplateObj) {
		this.jdbcTemplateObj = jdbcTemplateObj;
	}

	@Override
	public void createEmployee(Employee employeeObj) {

		String sql = null;
		int returnedId = 0;

		sql = "INSERT INTO `employee` (`name`, `email`, `gender`, `salary`) VALUES (?,?,?,?)";
		returnedId = jdbcTemplateObj.update(sql, new Object[] { employeeObj.getName(), employeeObj.getEmail(),
				employeeObj.getGender(), employeeObj.getSalary() });

		if (returnedId > 0) {
			System.out.println("Employee details have been saved successfully.");
		}
	}

	@Override
	public Employee getEmployeeById(int id) {

		String sql = null;
		int returnedId = 0;

		sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE id=?";
		Employee employeeObj = jdbcTemplateObj.queryForObject(sql, new EmployeeRowMapper(), id);

		return employeeObj;
	}

	@Override
	public List<Employee> getAllEmployeesList() {

		String sql = null;

		sql = "SELECT `id`, `name`, `email`, `gender`, `salary` FROM `employee` WHERE 1";
		List<Employee> employeesList = jdbcTemplateObj.query(sql, new EmployeeRowMapper());

		return employeesList;
	}

	@Override
	public void updateEmployeeEmailIdById(String emailId, int id) {

		String sql = null;
		int returnedId = 0;

		sql = "UPDATE `employee` SET `email` = ? WHERE `employee`.`id` = ?";
		returnedId = jdbcTemplateObj.update(sql, emailId, id);

		if (returnedId > 0) {
			System.out.println("Employee Email Id has been updated successfully.");
		}
	}

	@Override
	public void deleteEmployeeById(int id) {

		String sql = null;
		int returnedId = 0;

		sql = "DELETE FROM `employee` WHERE `employee`.`id` = ?";
		returnedId = jdbcTemplateObj.update(sql, id);

		if (returnedId > 0) {
			System.out.println("Employee record has been deleted successfully.");
		}
	}

}
