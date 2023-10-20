package com.way2learnonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuditService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public void writeAuditLog(String message){
		
		
			
			String query="insert into auditlogs(logmessage) values(?) ";			
			jdbcTemplate.update(query,message);
			
		
	}

}
