package com.mistertandon.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.mistertandon.dao.EmployeeDao;
import com.mistertandon.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	@Resource(name="SimpleJdbcCallBC")
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
