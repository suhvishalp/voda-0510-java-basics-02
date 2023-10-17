package com.demo.repositories;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.model.Employee;

public class EmployeeRepositoryJDBCImpl implements EmployeeRepository{
	
	private BasicDataSource dataSource;
	
	public EmployeeRepositoryJDBCImpl(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection connection = this.dataSource.getConnection();
			
			//create the statement object 
			
			//execute the statements 
			
			//close the connection
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee getEmployee(int empId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
