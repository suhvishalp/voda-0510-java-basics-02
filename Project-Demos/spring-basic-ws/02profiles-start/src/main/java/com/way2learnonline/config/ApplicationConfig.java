package com.way2learnonline.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.JdbcAccountRepositoryImpl;
import com.way2learnonline.repository.JdbcRewardRepositoryImpl;
import com.way2learnonline.repository.JdbcTransactionRepositoryImpl;
import com.way2learnonline.repository.RewardRepository;
import com.way2learnonline.repository.StubAccountRepository;
import com.way2learnonline.repository.StubRewardRepository;
import com.way2learnonline.repository.StubTransactionRepository;
import com.way2learnonline.repository.TransactionRepository;
import com.way2learnonline.service.BankService;
import com.way2learnonline.service.BankServiceImpl;
import com.way2learnonline.service.EmailService;
import com.way2learnonline.service.EmailServiceImpl;

@Configuration
@Profile("prod")
public class ApplicationConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean	
	@Profile("prod")
	public AccountRepository jdbcAccountRepository(){
		
		JdbcAccountRepositoryImpl accountRepositoryImpl= new JdbcAccountRepositoryImpl(dataSource);		
		return accountRepositoryImpl;
	}
	
	@Bean

	public StubAccountRepository stubAccountRepository(){
		return new StubAccountRepository();
	}
	
	
	
	@Bean	
	public RewardRepository jdbcRewardRepository(){
		return  new JdbcRewardRepositoryImpl(dataSource);
	}
	
	@Bean	
	public StubRewardRepository stubRewardRepository(){
		return new StubRewardRepository();
	}
	
	
	@Bean	
	public TransactionRepository jdbcTransactionRepository(){
		return new JdbcTransactionRepositoryImpl(dataSource);
	}
	
	@Bean

	public StubTransactionRepository stubTransactionRepository(){
		return new StubTransactionRepository();
	}
	
	
	
	
	@Bean
	public EmailService emailService(){
		return new EmailServiceImpl();
	}
	
	
	@Bean
	public BankService bankService( AccountRepository accountRepository,EmailService emailService,
			RewardRepository rewardRepository,TransactionRepository transactionRepository){
		
		BankServiceImpl bankServiceImpl= new BankServiceImpl();
		bankServiceImpl.setAccountRepository(accountRepository);
		bankServiceImpl.setEmailService(emailService);
		bankServiceImpl.setRewardRepository(rewardRepository);
		bankServiceImpl.setTransactionRepository(transactionRepository);
		return bankServiceImpl;
	}

}
