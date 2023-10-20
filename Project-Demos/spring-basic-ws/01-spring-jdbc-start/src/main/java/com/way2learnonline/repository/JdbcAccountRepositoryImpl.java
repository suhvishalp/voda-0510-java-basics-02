package com.way2learnonline.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.way2learnonline.model.Account;



public class JdbcAccountRepositoryImpl implements AccountRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public Account findAccountByNumber(Long accountNUmber)  {
		String query="select a.accountNumber,a.name,a.isActive,a.city as city ,"
				+ "a.country as country,a.balance ,a.emailaddress "
				+ "from account a where a.accountNumber=? ";	
		
		
		Account account=null ; // TODO-1 initialize account by firing the above query using JdbcTemplate. 
								//Create your own RowMapper implementation and use it.
								// Run AccountRepositoryTests and make sure the corresponding test for this will pass
		
		return account;
	}

	public List<Account> findAllAccounts()  {
		String query="select a.accountNumber,a.name,a.isActive,a.city as city,"
				+ " a.country as country,a.balance ,a.emailaddress from account a  ";
		
		List<Account> accountList=null;
		
		// TODO-2 initialize accountList by firing the above query using JdbcTemplate. 
		//Use BeanPropertyRowMapper to map row to Account Object.
		// Run AccountRepositoryTests and make sure the corresponding test for this will pass
		return accountList;
	}
	
	public String findNameByAccountNumber(Long accountNumber) { 
		String sql="select name from Account where accountNumber= ?";
		
		String name=null;
		// TODO -3 initialize name by firing query using JdbcTemplate
		// Run AccountRepositoryTests and make sure the corresponding test for this will pass
		return  name;
	}
	
	

	public Map<String, Object> getAccountByNumberAsMap(Long accountNumber) {
		String query="select a.accountNumber,a.name,a.isActive,a.city ,"
				+ "a.country ,a.balance "
				+ ",a.emailaddress from account a where a.accountNumber=? ";	
		
		
		Map<String, Object> account=null;
				// TODO -4 Assume that we dont have a domain class Account. We want to retrieve account details as Map.
				//	initialize account by firing query using JdbcTemplate
				// Run AccountRepositoryTests and make sure the corresponding test for this will pass
		
		return account;
	}
	
	

	public List<Map<String, Object>> getAllAccountsAsMap() {
		String query="select a.accountNumber,a.name,a.isActive,"
				+ " a.city,a.country,a.balance ,a.emailaddress from account a  ";
		
		 List<Map<String, Object>> accountList=null;
		 
		// TODO -5 Assume that we dont have a domain class Account. We want to retrieve  details as List of  Maps.
			//	initialize accountList by firing query using JdbcTemplate
			// Run AccountRepositoryTests and make sure the corresponding test for this will pass
	
		
		return accountList;
	}


	public void save(Account account)  {
		String query="insert into account(name,isactive,city,country,balance,emailaddress) values(?,?,?,?,?,?)";
		// TODO -6  Use Jdbc Template to fire above insert Query
		
		System.out.println("Account saved");	
	}

	public void update(Account account) {
		//
		String query="update account set name=?,isactive=?,city=?,"
				+ " country=?,balance=?,emailaddress=? where accountnumber=?";
		// TODO-7  Use Jdbc Template to fire above Update Query
		
		System.out.println("Account updated");
	}

	public void delete(Account account)  {
		String query="delete from  account a where  a.accountnumber=?";
		// TODO-8  Use Jdbc Template to fire above delete Query
		System.out.println("Account Deleted");
	
	}







}
