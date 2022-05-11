package com.model;

public class Employee {
	
	private int empId;
	private String firstname;
	private String lastname;
	private String mail;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public Employee(int empId, String firstname, String lastname, String mail) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
