package com.demo.exceptions;

public class CustomFieldError {
	
	private String fieldName;
	private String message;
	
	public CustomFieldError() {
		super();
	}
	
	

	public CustomFieldError(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}



	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
