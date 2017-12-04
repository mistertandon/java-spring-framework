package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id;

	private String name;
	
	@Autowired
	@Qualifier("PanCardB")
	private PanCard panCard;
	
	public Employee(int id, String name, PanCard panCard) {
		this.id = id;
		this.name = name;
		this.panCard = panCard;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public PanCard getPanCard() {
		return panCard;
	}

}
