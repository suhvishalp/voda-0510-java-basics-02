package com.demo.exceptions;

public class EmployeeNotFoundException extends Exception {

	private String message;
	
	public EmployeeNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
