package com.demo.model;

public class Employee implements Comparable<Employee> {
	

	private int empId;			//fields / instance variables / properties 
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getSalary() > o.getSalary())
				return 1;
		else if (this.getSalary() == o.getSalary())
				return 0;
		else 
			return -1;
	}
	
	
	
	
	
	
}
