package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Employees;
@Repository
public class EmployeeDAO {
    private static Employees list=new Employees();
    
    static {
    	list.getEmplist().add(new Employee(1,"admin","manager","admin@mail.com"));
    	list.getEmplist().add(new Employee(2,"admini","managers","aadmin@mail.com"));
    }
    public Employees getAllEmpList() {
    	return list;
    }
    public void addEmployee(Employee employee) {
    	list.getEmplist().add(employee);
    }
}
