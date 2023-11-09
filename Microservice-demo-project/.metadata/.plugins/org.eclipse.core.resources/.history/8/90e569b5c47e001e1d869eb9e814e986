package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.EmpResponseDto;
import com.demo.entities.EmployeeDto;
import com.demo.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;

    // Build Save Employee REST API
    @PostMapping()
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee REST API		//GET = localhost:9091/api/employees/1
    @GetMapping("/{id}")
    public ResponseEntity<EmpResponseDto> getEmployee(@PathVariable("id") Long employeeId){
    	EmpResponseDto empResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(empResponseDto, HttpStatus.OK);
    }
}