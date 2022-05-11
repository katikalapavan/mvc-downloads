package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.Employees;

@RestController
public class AppController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping("/loadall")
	 public Employees loadAll(
			 @RequestHeader(name="X-COM-PERSIST",required=true)String header,
			 @RequestHeader(name="X-COM-LOCATION",defaultValue="ASIA")String loc
			 ){
		return employeeDAO.getAllEmpList();
	}
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody Employee emp){
		
		int id=employeeDAO.getAllEmpList().getEmplist().size()+1;
		emp.setEmpId(id);
		employeeDAO.addEmployee(emp);
		return ResponseEntity.ok("Emp Added");
		
	}

}
