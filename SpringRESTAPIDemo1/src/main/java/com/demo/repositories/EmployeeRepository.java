package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//define Query method 
	List<Employee> findAllByCity(String city);
	
	List<Employee> findAllBySalaryGreaterThan(double salary);
	
	
	//define a custom query using @Query annotation 
	
	
	//use NamedQuery
	
	
	
}
