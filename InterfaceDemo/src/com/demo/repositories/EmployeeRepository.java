package com.demo.repositories;

import java.util.ArrayList;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.model.Employee;

public interface EmployeeRepository {

	//interface contains only abstract methods 
	public abstract void addEmployee(Employee employee);
	
	public abstract Employee getEmployee(int empId) throws EmployeeNotFoundException;
	
	public abstract ArrayList<Employee> getAllEmployees();
	
	public abstract void deleteEmployee(int empId) throws EmployeeNotFoundException;
}
