package com.way2learnonline.repository;

import java.util.List;
import java.util.Map;

import com.way2learnonline.model.Account;



public interface AccountRepository {
	public Map<String,Object> getAccountByNumberAsMap(Long accountNumbe);
	public List<Map<String, Object>> getAllAccountsAsMap();
	public String findNameByAccountNumber(Long accountNumber);
	public Account findAccountByNumber(Long accountNUmber) ;
	public List<Account> findAllAccounts() ;
	public void save(Account account) ;
	public void update(Account account);
	public void delete(Account account) ;
}
