package com.springboot.second.app.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.second.app.model.EmployeeBean;
import com.springboot.second.app.repository.EmployeeRepository;
import com.springboot.second.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public EmployeeBean saveEmployee(EmployeeBean employee) {
		return employeeRepository.save(employee);
	}

}
