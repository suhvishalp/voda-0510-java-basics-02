package com.demo;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.JdbcAccountRepositoryImpl;

@Configuration
public class ApplicationConfig {
	
	
	@Bean
	public BasicDataSource createDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		dataSource.setDriverClassName("");
		return dataSource;
	}

	@Bean
	public AccountRepository createAccountRepo(BasicDataSource dataSource) {
		//logic to create account repo
		
		return new JdbcAccountRepositoryImpl(dataSource);
	}
	
}
