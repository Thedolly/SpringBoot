package com.springboot.second.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.second.app.model.EmployeeBean;
import com.springboot.second.app.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmloyeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmloyeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//build create employee REST API
	@PostMapping("/api/employees")
	public ResponseEntity<EmployeeBean> saveEmployee(@RequestBody EmployeeBean Emp){
		return new ResponseEntity<EmployeeBean>(employeeService.saveEmployee(Emp), HttpStatus.CREATED);
		
	}

}
