package com.way2learnonline.dao;

import java.util.List;

import com.way2learnonline.domain.Customer;


public interface CustomerDao {
	
	public List<Customer> getAllCustomers() throws Exception;
	public Customer getCustomerById(int customerId) throws Exception;

}
 