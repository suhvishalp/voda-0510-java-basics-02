package com.demo.model;

import org.springframework.stereotype.Component;

public class Employee  {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("employee object is created");
	}

	
	public void anyMethodName() {
		System.out.println("this is init method to perform some post initialization tasks ");
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("empId is set");
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name is set");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("salary is set");
		this.salary = salary;
	}
	
	

}
