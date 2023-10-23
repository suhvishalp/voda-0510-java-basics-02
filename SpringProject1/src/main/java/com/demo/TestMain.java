package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
//		EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);
		
//		Employee employee1 = context.getBean("emp", Employee.class);
//		System.out.println("name of employee 1 : " + employee1.getName());
//		
//		Employee employee2 = context.getBean("emp", Employee.class);
//		System.out.println("name of employee 2 : " + employee1.getName());
//		
//		Employee employee3 = context.getBean("emp", Employee.class);
//		System.out.println("name of employee 3 : " + employee1.getName());

		
//		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
	}

}
