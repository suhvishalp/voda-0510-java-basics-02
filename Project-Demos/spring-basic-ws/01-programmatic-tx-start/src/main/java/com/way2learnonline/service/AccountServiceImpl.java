package com.way2learnonline.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.way2learnonline.model.Account;
import com.way2learnonline.model.TransactionDetail;
import com.way2learnonline.model.TransactionType;
import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.RewardRepository;
import com.way2learnonline.repository.TransactionRepository;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private RewardRepository rewardRepository;
	@Autowired
	private EmailService emailService;
	@Autowired
	private AuditService auditService;

	@Autowired
	private PlatformTransactionManager transactionManager;

	@Transactional
	public Long debit(int amount, Long accountNumber) throws SQLException {

		// start the transaction
//		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
//		TransactionStatus status = transactionManager.getTransaction(definition);
//		
//		System.out.println("Inside Debit() Method : " + status.isNewTransaction());		//false

		try {

			// op:1 inserting a message into auditlog table
			auditService.writeAuditLog(
					"trying to debit " + amount + "  from  account with account number " + accountNumber);

			// op:2 finding account
			Account account = accountRepository.findAccountByNumber(accountNumber);
			account.debit(amount);

			// op:3 updating account table
			accountRepository.update(account);

			TransactionDetail fromTransactionDetail = new TransactionDetail(accountNumber, new Date(), amount,
					TransactionType.DEBIT);

			// op:4 - inserting a record into transactiondetials table
			Long transactionId = transactionRepository.addTransaction(fromTransactionDetail);
			emailService.sendMail(account.getEmailAddress(), "admin@mybank.com",
					amount + " has been debited from your account");

			// 5 - inserting a message into auditlog table
			auditService.writeAuditLog(amount + " has been debited from  account with account number " + accountNumber);

			// if no error - then commit the transaction

		//	transactionManager.commit(status);

			return transactionId;

		} catch (Exception ex) {
			//transactionManager.rollback(status);
		}

		return null;
	}

	
	@Transactional
	public Long credit(int amount, Long accountNumber) throws SQLException {

		// start the trasanction
//		DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
//		TransactionStatus status = transactionManager.getTransaction(definition);
//
//		System.out.println("Inside Credit() Method : " + status.isNewTransaction());		//false

		try {

			auditService.writeAuditLog(
					"trying to credit " + amount + "  from  account with account number " + accountNumber);
			Account account = accountRepository.findAccountByNumber(accountNumber);
			account.credit(amount);

			// TODO -1 uncomment the below code to simulate exception.

			if (true) {
				throw new RuntimeException("Just for testing....");
			}
			accountRepository.update(account);
			TransactionDetail toTransactionDetail = new TransactionDetail(accountNumber, new Date(), amount,
					TransactionType.CREDIT);

			Long transactionId = transactionRepository.addTransaction(toTransactionDetail);
			emailService.sendMail(account.getEmailAddress(), "admin@mybank.com",
					amount + " has been credited into your account");

			auditService
					.writeAuditLog(amount + " has been credit  into   account with account number " + accountNumber);

			// if no error / exception -- then commit the transaction
			//transactionManager.commit(status);
			return transactionId;

		} catch (Exception ex) {
			//transactionManager.rollback(status);
			throw new RuntimeException("Something went wrong in credit method");
		}
		
		//return null;

	}

	public void createNewAccount(Account account) throws SQLException {
		accountRepository.save(account);

	}

	public void deActivateAccount(Long accountNumber) throws SQLException {
		Account account = accountRepository.findAccountByNumber(accountNumber);
		account.setActive(false);
		accountRepository.update(account);

	}

	public void activateAccount(Long accountNumber) throws SQLException {
		Account account = accountRepository.findAccountByNumber(accountNumber);
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
