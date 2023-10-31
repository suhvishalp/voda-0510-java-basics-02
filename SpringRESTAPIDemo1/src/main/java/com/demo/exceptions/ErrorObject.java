package com.demo.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorObject {

	private LocalDateTime timeStamp;
	private int statusCode;
	private String path;
	private String message;
	
	public ErrorObject() {
		super();
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	 

	 

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
