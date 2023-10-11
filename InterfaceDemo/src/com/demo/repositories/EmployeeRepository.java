package com.demo.repositories;

import java.util.ArrayList;

import com.demo.model.Employee;

public interface EmployeeRepository {

	//interface contains only abstract methods 
	public abstract void addEmployee(Employee employee);
	
	public abstract Employee getEmployee(int empId);
	
	public abstract ArrayList<Employee> getAllEmployees();
	
	public abstract void deleteEmployee(int empId);
}
