package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.EmployeeDAO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
		EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);

	}

}
