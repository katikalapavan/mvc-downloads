package com.model;

public class Employee {
private String name;
private String location;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Employee(String name, String location) {
	super();
	this.name = name;
	this.location = location;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [name=" + name + ", location=" + location + "]";
}


}
