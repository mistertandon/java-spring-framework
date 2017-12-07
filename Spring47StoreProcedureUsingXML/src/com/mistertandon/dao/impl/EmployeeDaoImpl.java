package com.mistertandon.dao.impl;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.mistertandon.dao.EmployeeDao;
import com.mistertandon.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private SimpleJdbcCall simpleJdbcCallObj;

	public SimpleJdbcCall getSimpleJdbcCallObj() {
		return simpleJdbcCallObj;
	}

	public void setSimpleJdbcCallObj(SimpleJdbcCall simpleJdbcCallObj) {
		this.simpleJdbcCallObj = simpleJdbcCallObj;
	}

	@Override
	public Employee getEmployeeNameAndSalaryById(int employeeId) {

		simpleJdbcCallObj.withProcedureName("getEmployeeNameAndSalaryById");

		MapSqlParameterSource mapSqlParameterSourceObj = new MapSqlParameterSource();
		mapSqlParameterSourceObj.addValue("emp_id", employeeId);

		Map<String, Object> mapObject = simpleJdbcCallObj.execute(mapSqlParameterSourceObj);

		Employee employeeObj = new Employee();
		employeeObj.setName(((String) mapObject.get("emp_name")));
		employeeObj.setSalary(((Double) mapObject.get("emp_salary")));

		return employeeObj;
	}

}
