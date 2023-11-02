package com.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.demo.dto.EmployeeModel;
import com.demo.entities.Employee;
import com.demo.exceptions.CustomFieldError;
import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.exceptions.ErrorObject;
import com.demo.exceptions.InvalidRequestBodyError;
import com.demo.services.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

		
	
	@GetMapping()
	public List<Employee> getAllEmployees(){
		
		return empService.getAllEmployees();
	}
	
	
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") Long id) throws EmployeeNotFoundException {
		
		Employee emp = empService.getEmployee(id);
		
		if(emp!=null)
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
		else 
			throw new EmployeeNotFoundException("Employee with the given ID not found in the DB");
	}
	
	
	
	
	
	//POST  - /api/employees { }
	@PostMapping()
	public ResponseEntity<EmployeeModel> createEmployee(@Valid @RequestBody EmployeeModel empModel) {
		
		Employee emp = new Employee();
		emp.setName(empModel.getName());
		emp.setCity(empModel.getCity());
		emp.setSalary(empModel.getSalary());
		
		Employee empCreated = empService.saveEmployee(emp);
		EmployeeModel em = new EmployeeModel(empCreated.getName(), empCreated.getCity(), empCreated.getSalary());
		 
		return new ResponseEntity<EmployeeModel>(em, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	@PutMapping("/{id}")		// /{path-parameter}
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		
		return empService.updateEmployee(employee, id);
	}
		
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable("id") Long id) {
		return empService.deleteEmployee(id);
	}
	
	@GetMapping("/query")
	public List<Employee> searchEmployees(@RequestParam(value = "city", required = false) String city, 
											@RequestParam(value = "salary", required = false) Double salary){
		
		if(city!=null) 
			return empService.getAllEmployeesByCity(city);
		else if (salary!=null)
			return empService.getAllEmployeesBySalary(salary);
		
		return null;
		
	}
	
}












