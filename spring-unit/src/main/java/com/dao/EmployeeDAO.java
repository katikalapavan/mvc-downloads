package com.dao;

import com.model.Employee;
import com.model.Employees;

public class EmployeeDAO {
private static Employees list=new Employees();
static {
	list.getEmpList().add(new Employee(1,"admin","manager","admin@gmail.com"));
	list.getEmpList().add(new Employee(2,"admin1","manager1","admin1@gmail.com"));
	
}
public Employees getAllEmpList() {
	return list;
}
public void addEmployee(Employee employee) {
	list.getEmpList().add(employee);
}
}
