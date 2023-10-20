package com.way2learnonline.service;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	
	 
	

	
	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
	
			Long transactionId= accountService.debit(amount,fromAccountNumber);
			accountService.credit(amount, toAccountNumber);

			
			return transactionId;			
		
				
				
	}
	
	
	

}
