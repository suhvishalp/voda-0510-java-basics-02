package com.demo;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.EmployeeRepositoryImpl;

public class TestEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EmployeeRepositoryImpl class uses arraylist to store the data 
		
		EmployeeRepository empRepo = new EmployeeRepositoryImpl();		
		
		
		
		
		//add a new employee
		Employee emp1 = new Employee(101, "Rohit", 2000.00);
		empRepo.addEmployee(emp1);
		
		Employee emp2 = new Employee(102, "Mohit", 4300.00);
		empRepo.addEmployee(emp2);
		
		Employee emp3 = new Employee(103, "Samrat", 5300.00);
		empRepo.addEmployee(emp3);
	
		Employee emp4 = new Employee(104, "Vaibhav", 1000.00);
		empRepo.addEmployee(emp4);
		
		Employee emp5 = new Employee(105, "Adarsh", 2600.00);
		empRepo.addEmployee(emp5);
		
		try {
			Employee empResult = empRepo.getEmployee(144);
			
			System.out.println("Employee found = " + empResult);
			
			
		}catch(EmployeeNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
