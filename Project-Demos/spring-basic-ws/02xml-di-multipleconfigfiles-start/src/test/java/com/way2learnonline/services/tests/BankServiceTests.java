package com.way2learnonline.services.tests;

import java.sql.SQLException;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.way2learnonline.service.*;



public class BankServiceTests {	
	
	private BankService bankService;	
	ClassPathXmlApplicationContext context;
	
	@Before
	public void init() throws Exception{
		
		 context= new ClassPathXmlApplicationContext("application-config.xml");			
		 bankService=(BankService) context.getBean("bankService");
		
	}	

	@Test
	public void testTransfer() throws SQLException{
		
		Long transactionId=bankService.transfer(new Long(1), new Long(2), 5000);
		assertNotNull(transactionId);
	}
	
	public void destroy(){
		context.close();
	}
	

}
