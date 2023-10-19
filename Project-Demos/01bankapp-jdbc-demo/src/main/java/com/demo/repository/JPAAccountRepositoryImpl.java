package com.demo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import com.demo.model.Account;
import com.demo.model.Address;

public class JPAAccountRepositoryImpl implements AccountRepository {
	
	private EntityManager entityManager;
	
	

	public JPAAccountRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	


	public Account findAccountByNumber(Long accountNUmber) throws SQLException {
		
		return entityManager.find(Account.class, accountNUmber);
		
	}
	
	

	public List<Account> findAllAccounts() throws SQLException {
		return null;
	}

	public void save(Account account) throws SQLException {
		
		//begin transaction
		this.entityManager.persist(account);
		//commit transaction
	}

	public void update(Account account) throws SQLException {
		Account acc = this.entityManager.find(Account.class, account.getAccountNumber());
		if(acc!=null) {
			acc.setAddress(account.getAddress());
			acc.setBalance(account.getBalance());
			acc.setName(account.getName());
			acc.setEmailAddress(account.getEmailAddress());
		}
	}

	public void delete(Account account) throws SQLException {
	
		Account acc = this.entityManager.find(Account.class, account.getAccountNumber());
		if(acc!=null) {
			//begin the transaction
			this.entityManager.remove(acc);
			//commit the transaction
		}
	
	}

}
	
