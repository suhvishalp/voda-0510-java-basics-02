package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import com.way2learnonline.dao.CustomerDao;

	@SpringBootApplication	
	public class CachingApplication {
		
		
		public static void main(String[] args) throws Exception {
			ApplicationContext context=SpringApplication.run(CachingApplication.class);
			CustomerDao customerDao=context.getBean(CustomerDao.class);
			customerDao.getCustomerById(1);	
		}
	
	}
	
	
