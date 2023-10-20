package com.way2learnonline.repository.tests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.dao.CustomerDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:caching.xml"})
public class CustomerDaoTests {
	
	@Resource(name="customerDao")
	private CustomerDao customerDao;

	
	@Test
	public void testGetAllCustomers() throws Exception {
		
		//customerDao.getAllCustomers();
		//customerDao.getAllCustomers();
		//customerDao.getAllCustomers();
		
		customerDao.getCustomerById(1);
		customerDao.getCustomerById(1);
		customerDao.getCustomerById(1);
		customerDao.getCustomerById(1);
		
		
		
	}
	
	

}
