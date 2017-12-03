package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;

	private String name;

	private PanCard panCardObj;

	@Autowired
	public Employee(int id, String name, PanCard panCardObj) {

		super();
		this.id = id;
		this.name = name;
		this.panCardObj = panCardObj;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public PanCard getPanCardObj() {
		return panCardObj;
	}
}
