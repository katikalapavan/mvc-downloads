package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employees;
@RestController
public class AppController {
@Autowired
private EmployeeDAO employeeDAO;
@GetMapping("/loadall")
public Employees loadAll() {
	return employeeDAO.getAllEmpList();
}
}
