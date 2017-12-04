package com.mistertandon.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;

	private String name;
	
	@Autowired
	@Resource(name="PanCardB")
	private PanCard panCard;

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

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

}
