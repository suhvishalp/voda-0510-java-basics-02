package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaDemo2Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringDataJpaDemo2Application.class, args);
		
//		EmployeeService empService = context.getBean(EmployeeService.class);
//		
//		Employee emp1 = new Employee(101, "Vishal", "Pune", 2000.00);
//		empService.saveEmployee(emp1);
	}

}
