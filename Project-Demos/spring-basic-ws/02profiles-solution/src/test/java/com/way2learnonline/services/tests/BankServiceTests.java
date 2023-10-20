package com.way2learnonline.services.tests;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.config.ApplicationConfig;
import com.way2learnonline.config.InfrastructureConfig;
import com.way2learnonline.service.BankService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={InfrastructureConfig.class,ApplicationConfig.class})
@Sql(scripts="classpath:dbscripts.sql")
@ActiveProfiles("prod")
public class BankServiceTests {	
	@Autowired
	private BankService bankService;
	


	
	@Test
	public void testTransfer() throws SQLException{
		
		Long transactionId=bankService.transfer(new Long(1), new Long(2), 5000);
		assertNotNull(transactionId);
	}
	
	
	

}
