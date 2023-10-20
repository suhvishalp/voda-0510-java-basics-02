package com.way2learnonline.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.way2learnonline.domain.Customer;



public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Customer> getAllCustomers() throws Exception {
					
		
		return jdbcTemplate.query("Select * from Customers",
				new BeanPropertyRowMapper<Customer>(Customer.class)) ;
	}

	public Customer getCustomerById(int customerId) throws Exception{
		
			return jdbcTemplate.queryForObject("Select * from Customers where customerId=?", new Object[]{customerId},
													new BeanPropertyRowMapper<Customer>(Customer.class)) ;
		
	}

}
