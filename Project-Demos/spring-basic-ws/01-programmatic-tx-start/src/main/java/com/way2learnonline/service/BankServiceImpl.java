package com.way2learnonline.service;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	
	@Autowired
	private PlatformTransactionManager transactionManager;

	 
	@Transactional
	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
//		//start the transaction
//		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
//		TransactionStatus status = transactionManager.getTransaction(definition);
//		
//		System.out.println("Inside transfer () Method : " + status.isNewTransaction());		//true		

//		
		try {
			Long transactionId= accountService.debit(amount,fromAccountNumber); //success
			accountService.credit(amount, toAccountNumber);	//success

			//if no error -- commit the transaction
			//transactionManager.commit(status);
			
			return transactionId;			
			
			
		}catch (Exception e) {
			//if there is any exception, then we have to rollback
			System.out.println("something went wrong, so rollback");
			//transactionManager.rollback(status);
			return null;
		}
	}
	
	
	

}
