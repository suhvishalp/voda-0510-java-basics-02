package com.way2learnonline.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.way2learnonline.service.BankService;

@Configuration

@EnableAutoConfiguration
public class BankApplication {
	
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context=  SpringApplication.run(BankApplication.class, args);
		BankService bankService= context.getBean(BankService.class);
		bankService.transfer(new Long(1), new Long(2), 1000);
	}

}
