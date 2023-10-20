package com.way2learnonline.repository;

import java.sql.SQLException;
import java.util.List;

import com.way2learnonline.model.Account;


public class StubAccountRepository implements AccountRepository {
	
	public StubAccountRepository() {
		System.out.println("StubAccountRepository.StubAccountRepository()");
	}

	public Account findAccountByNumber(Long accountNumber) throws SQLException {
		System.out.println("StubAccountRepository.findAccountByNumber()");
		return new Account(accountNumber, "shiva", true, 10000, "a@gmail.com", "bangalore", "India");
		
	}

	public List<Account> findAllAccounts() throws SQLException { 
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Account account) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void update(Account account) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void delete(Account account) throws SQLException {
		// TODO Auto-generated method stub

	}

}
