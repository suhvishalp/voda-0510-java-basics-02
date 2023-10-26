package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Employee;
import com.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	public EmployeeService() {
		super();
	} 
	
	
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return empRepo.findById(id);
	}
	
	public Iterable<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
	}
	
	
}
