package com.way2learnonline.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.way2learnonline.model.*;
import com.way2learnonline.repository.*;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	


	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
				Long transactionId= accountService.debit(amount,fromAccountNumber);
						accountService.credit(amount, toAccountNumber);
			
			return transactionId;
				
	}
	
	
	

}
