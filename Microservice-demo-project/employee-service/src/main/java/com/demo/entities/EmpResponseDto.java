package com.demo.entities;

public class EmpResponseDto {

	private EmployeeDto empDto;
	private DepartmentDto deptDto;
	
	private String serverPort;
	
	public EmpResponseDto() {
		super();
	}
	
	
	
	



	public String getServerPort() {
		return serverPort;
	}







	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}







	public EmployeeDto getEmpDto() {
		return empDto;
	}
	public void setEmpDto(EmployeeDto empDto) {
		this.empDto = empDto;
	}
	public DepartmentDto getDeptDto() {
		return deptDto;
	}
	public void setDeptDto(DepartmentDto deptDto) {
		this.deptDto = deptDto;
	}
	
	
}
