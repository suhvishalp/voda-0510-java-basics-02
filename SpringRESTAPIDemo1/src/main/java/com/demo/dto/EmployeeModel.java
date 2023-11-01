package com.demo.dto;

public class EmployeeModel {
	
	private String name;
	private String city;
	private double salary;
	
	public EmployeeModel() {
		super();
	}
	
	
	public EmployeeModel(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
