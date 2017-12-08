package com.mistertandon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mistertandon.dao.EmployeeDAO;
import com.mistertandon.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private HibernateTemplate hibernateTemplateObj;

	public HibernateTemplate getHibernateTemplateObj() {
		return hibernateTemplateObj;
	}

	public void setHibernateTemplateObj(HibernateTemplate hibernateTemplateObj) {
		this.hibernateTemplateObj = hibernateTemplateObj;
	}

	@Override
	public void createEmployeeEDAO(Employee employee) {

		hibernateTemplateObj.save(employee);
	}

	@Override
	public Employee getEmployeeByIdEDAO(int id) {

		return hibernateTemplateObj.get(Employee.class, id);
	}

	@Override
	public void deleteEmployeeByIdEDAO(int id) {

		Employee employeeObj = new Employee();
		employeeObj.setId(id);
		hibernateTemplateObj.delete(employeeObj);
	}

	@Override
	public void updateEmployeeEmailByIdEDAO(String emailId, int employeeId) {

		Employee employeeObj = hibernateTemplateObj.get(Employee.class, employeeId);
		employeeObj.setEmail(emailId);
		hibernateTemplateObj.update(employeeObj);
	}

	@Override
	public List<Employee> getAllEmployeesDetailsEDAO() {

		DetachedCriteria detachedCriteriaObj = DetachedCriteria.forClass(Employee.class);

		List<Employee> employeeList = (List<Employee>) hibernateTemplateObj.findByCriteria(detachedCriteriaObj);

		return employeeList;
	}

}
