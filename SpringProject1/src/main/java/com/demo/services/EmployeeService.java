package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.EmployeeDAO;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	public EmployeeService() {
		System.out.println("Employee service object created - (no-arg constructor)");
	}
	
	public EmployeeService(EmployeeDAO employeeDAO) {
		this();
		System.out.println("empDao is intialized");
		this.employeeDao = employeeDAO;
	}

	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		System.out.println("employeedao is set");
		this.employeeDao = employeeDao;
	}
}
