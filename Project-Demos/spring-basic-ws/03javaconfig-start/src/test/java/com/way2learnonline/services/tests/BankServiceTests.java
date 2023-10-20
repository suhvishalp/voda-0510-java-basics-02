package com.way2learnonline.services.tests;

import java.sql.SQLException;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.jdbc.Sql;

import com.way2learnonline.service.*;



@Sql(scripts={"classpathdbscripts.sql"})
public class BankServiceTests {	
	
	private BankService bankService;
	
	@Before
	public void init() throws Exception{
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("application-config.xml","infrastructure-config.xml");
		
		
		bankService=context.getBean("bankService",BankService.class);
		context.close();
	}	

	@Test
	public void testTransfer() throws SQLException{
		
		Long transactionId=bankService.transfer(new Long(1), new Long(2), 5000);
		assertNotNull(transactionId);
	}
	

}
