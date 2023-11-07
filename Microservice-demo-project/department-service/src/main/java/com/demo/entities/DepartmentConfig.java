package com.demo.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class DepartmentConfig {
	
	private String departmentCode;
	
	private String departmentManager;
	
	private boolean departmentStatus;
	private String departEnvironment;
	
	
	
	
	public String getDepartEnvironment() {
		return departEnvironment;
	}


	public void setDepartEnvironment(String departEnvironment) {
		this.departEnvironment = departEnvironment;
	}


	public DepartmentConfig() {
		super();
	}

	
	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}

	public boolean isDepartmentStatus() {
		return departmentStatus;
	}

	public void setDepartmentStatus(boolean departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	
	

}
