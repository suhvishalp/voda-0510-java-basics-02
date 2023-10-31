package com.demo.services;

import java.util.List;
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
	
		//save the given emp
		return empRepo.save(emp);
	}
	
	public Employee getEmployee(Long id) {
		
		//fetch the emp of the given id 
	    Optional<Employee>  optional = empRepo.findById(id);	
		return optional.isPresent() ? optional.get() : null;
	}
	
	
	public List<Employee> getAllEmployees(){
		
		return empRepo.findAll();
	}
	
	public Employee updateEmployee(Employee emp, Long id) {
	
		//update the emp
		Employee employee = getEmployee(id);
		
		if(employee!=null) {
			employee.setCity(emp.getCity());
			employee.setName(emp.getName());
			employee.setSalary(emp.getSalary());
			return saveEmployee(employee);
		}
		
		return null;
	}
	
	public Employee deleteEmployee(Long id) {
		Employee employee = getEmployee(id);
		if(employee!=null) {
			empRepo.delete(employee);
			return employee;
		}
		return null;
	}
	
	public List<Employee> getAllEmployeesByCity(String city){
		return empRepo.findAllByCity(city);
	}
	
	public List<Employee> getAllEmployeesBySalary(double salary){
		return empRepo.findAllBySalaryGreaterThan(salary);
	}
	
	
	
}
