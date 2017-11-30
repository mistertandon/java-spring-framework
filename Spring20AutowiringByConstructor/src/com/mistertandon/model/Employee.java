package com.mistertandon.model;

public class Employee {

	private int employeeId;

	private String employeeName;

	private String employeeEmailId;

	private PanCard panCardObj;

	public Employee(int employeeId, String employeeName, String employeeEmailId, PanCard panCardObj) {

		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmailId = employeeEmailId;
		this.panCardObj = panCardObj;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	public PanCard getPanCardObj() {
		return panCardObj;
	}

	public void setPanCardObj(PanCard panCardObj) {
		this.panCardObj = panCardObj;
	}
	
	
}
