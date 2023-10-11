package com.demo.repositories;

import java.util.ArrayList;

import com.demo.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	private ArrayList<Employee> listEmployees;
	
	public EmployeeRepositoryImpl() {
		super();
		this.listEmployees = new ArrayList<>();
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		listEmployees.add(employee);
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		
		for(Employee emp : listEmployees) {
			if(emp.getEmpId() == empId)
				return emp;
		}
		
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.listEmployees;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee emp = getEmployee(empId);
		
		if(emp!=null) {
			listEmployees.remove(emp);
		}
	}

	
	
}
