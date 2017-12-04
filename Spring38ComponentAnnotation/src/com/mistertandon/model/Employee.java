package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeObj")
public class Employee {

	@Value("${Employee.id}")
	private int id;

	@Value("${Employe.name}")
	private String name;

	@Autowired
	private PanCard panCardObj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PanCard getPanCardObj() {
		return panCardObj;
	}

	public void setPanCardObj(PanCard panCardObj) {
		this.panCardObj = panCardObj;
	}
}
