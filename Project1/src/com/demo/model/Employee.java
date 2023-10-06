package com.demo.model;

public class Employee {
	
	public static String companyName;

	public int empId;
	public String name;
	public double salary;
	
	
	//static method
	public static void showCompanyName() {
		System.out.println("Company Name : "+ companyName);
		
		//error: cannnot use non-static members here
		//System.out.println("Name : " + name);
	}
	
	
}
