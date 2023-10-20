package com.way2learn.repository.tests;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.dao.CustomerDao;
import com.way2learnonline.domain.Customer;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:caching.xml"})
public class CustomerDaoTests {
	
	@Resource(name="customerDao")
	private CustomerDao customerDao;

	@Test
	public void testGetAllCustomers() throws Exception {
		customerDao.getAllCustomers();
		customerDao.getAllCustomers();
		customerDao.getAllCustomers();
		List<Customer> customers=customerDao.getAllCustomers();
		
		assertNotNull(customers);
		
	}
	
	

}
