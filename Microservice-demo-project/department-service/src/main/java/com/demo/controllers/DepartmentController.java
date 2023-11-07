package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.DepartmentConfig;
import com.demo.entities.DepartmentDto;
import com.demo.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	@Autowired
	private ServerProperties serverProperties;

	@Autowired
    private DepartmentService departmentService;
	
	@Autowired
	private DepartmentConfig departmentConfig;

	
	//POST mapping to create a department 
	  @PostMapping()
	    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
	        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	  @GetMapping()
	  public ResponseEntity<DepartmentConfig> departmentConfig(){
		  return new ResponseEntity<>(departmentConfig, HttpStatus.OK);
	  }
	
	//GET mapping to get a department by id 
	  // Build get department rest api
	    @GetMapping("/{department-code}")
	    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
	        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
	        
	        departmentDto.setServerPort("Port NO: " + serverProperties.getPort());
	        
	        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
	    }
	
	//GET mapping to get a department by code 
	
	
	//GET mapping to get all the departments 
	
	
	//Note: integrate this project with Sping OpenAPI Doc / Swagger to expose the API Documentation 
	
}
