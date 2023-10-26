package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	//<S extends T> S save(S entity) 	-> Saves a given entity
	//void deleteById(Id id)
	//voide deleteAll()
	//Iterable<T> findAll()
	//T findById(Id id)
}


//spring data jpa automatically creates a proxy class that implements this interface, internally it uses the EntityManager to persist the entities 
