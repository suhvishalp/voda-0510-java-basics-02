package com.way2learnonline.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.way2learnonline.model.Account;
import com.way2learnonline.model.TransactionDetail;
import com.way2learnonline.model.TransactionType;
import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.RewardRepository;
import com.way2learnonline.repository.TransactionRepository;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired private TransactionRepository transactionRepository;
	@Autowired private RewardRepository rewardRepository;	
	@Autowired private EmailService emailService;
	
	@Autowired private AuditService auditService;
	



	

	public Long debit(int amount, Long accountNumber) throws SQLException {
		
			auditService.writeAuditLog("trying to debit "+amount+"  from  account with account number "+accountNumber);
					
			Account account=accountRepository.findAccountByNumber(accountNumber);		
			account.debit(amount);		
			accountRepository.update(account);
			
			TransactionDetail fromTransactionDetail= 
					new TransactionDetail(accountNumber,new Date(),amount,TransactionType.DEBIT);

			Long transactionId=transactionRepository.addTransaction(fromTransactionDetail);
			emailService.sendMail(account.getEmailAddress(), "admin@mybank.com", amount+" has been debited from your account");
			
			auditService.writeAuditLog(amount+" has been debited from  account with account number "+accountNumber);

			return transactionId;
		
	}

	public Long credit(int amount, Long accountNumber) throws SQLException {
		
		auditService.writeAuditLog("trying to credit "+amount+"  from  account with account number "+accountNumber);
			Account account=accountRepository.findAccountByNumber(accountNumber);		
			account.credit(amount);		
			// TODO -1 uncomment the code below to simulate an exception
			
			/*if(true){
				throw new RuntimeException("Just for testing....");
			}*/
			accountRepository.update(account);
			TransactionDetail toTransactionDetail= 
					new TransactionDetail(accountNumber,new Date(),amount,TransactionType.CREDIT);

			Long transactionId=transactionRepository.addTransaction(toTransactionDetail);
			emailService.sendMail(account.getEmailAddress(), "admin@mybank.com", amount+" has been credited into your account");
			
			auditService.writeAuditLog(amount+" has been credit  into   account with account number "+accountNumber);


			return transactionId;
		

		
	}

	public void createNewAccount(Account account) throws SQLException {
		accountRepository.save(account);
		
	}

	public void deActivateAccount(Long accountNumber) throws SQLException {
		Account account=accountRepository.findAccountByNumber(accountNumber);		
		account.setActive(false);		
		accountRepository.update(account);
		
	}

	public void activateAccount(Long accountNumber) throws SQLException {
		Account account=accountRepository.findAccountByNumber(accountNumber);		
		account.setActive(true);		
		accountRepository.update(account);
		
	}

	public List<Account> getAllAccounts() throws SQLException {
		System.out.println("BankServiceImpl.getAllAccounts()");
		return accountRepository.findAllAccounts();
	}


	public AccountRepository getAccountRepository() {
		return accountRepository;
	}


	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


	public TransactionRepository getTransactionRepository() {
		return transactionRepository;
	}


	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}


	public RewardRepository getRewardRepository() {
		return rewardRepository;
	}


	public void setRewardRepository(RewardRepository rewardRepository) {
		this.rewardRepository = rewardRepository;
	}


	public EmailService getEmailService() {
		return emailService;
	}


	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	

}
