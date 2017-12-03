package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Integer id;

	private String name;
	
	@Autowired(required=false)
	private PanCard panCardObj;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
