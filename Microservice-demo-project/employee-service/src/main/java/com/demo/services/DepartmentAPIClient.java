package com.demo.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.entities.DepartmentDto;

@FeignClient(name="DEPARTMENT-SERVICE")
public interface DepartmentAPIClient {
	
	 @GetMapping("/api/departments/{department-code}")
	 public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode);
	
	 
	 
}

