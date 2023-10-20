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
		String query="select a.accountNumber,a.name,a.isActive,a.city as city ,a.country as country,a.balance ,a.emailaddress from account a where a.accountNumber=? ";		
		Account account=jdbcTemplate.queryForObject(query,new Object[]{accountNUmber}, new BeanPropertyRowMapper<Account>(Account.class));
		

		return account;
	}

	public List<Account> findAllAccounts()  {
		String query="select a.accountNumber,a.name,a.isActive,a.city as address.city,a.country as address.country,a.balance ,a.emailaddress from account a  ";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Account>(Account.class));
		
	
	}

	public void save(Account account)  {
		String query="insert into account(name,isactive,city,country,balance,emailaddress) values(?,?,?,?,?,?)";
		jdbcTemplate.update(query,account.getName(),account.isActive(),account.getCity(),account.getCountry(),account.getBalance(),
				account.getEmailAddress());
		
		System.out.println("Account saved");	
	}

	public void update(Account account) {
		String query="update account set name=?,isactive=?,city=?,country=?,balance=?,emailaddress=? where accountnumber=?";
		jdbcTemplate.update(query,account.getName(),account.isActive(),account.getCity(),account.getCountry(),account.getBalance(),
				account.getEmailAddress(),account.getAccountNumber());
		
		System.out.println("Account updated");
	}

	public void delete(Account account)  {
		String query="delete from  account a where  a.accountnumber=?";
		jdbcTemplate.update(query,account.getAccountNumber());
		System.out.println("Account Deleted");
	
	}

	public String findNameByAccountNumber(Long accountNumber) { 
		String sql="select name from Account where accountNumber= ?";
		return jdbcTemplate.queryForObject(sql, String.class);
	}

	public Map<String, Object> getAccountByNumberAsMap(Long accountNumber) {
		String query="select a.accountNumber,a.name,a.isActive,a.city as 'address.city',a.country as 'address.country',a.balance ,a.emailaddress from account a where a.accountNumber=? ";		
		
		return jdbcTemplate.queryForMap(query, accountNumber);
	}

	public List<Map<String, Object>> getAllAccountsAsMap() {
		String query="select a.accountNumber,a.name,a.isActive,a.city as address.city,a.country as address.country,a.balance ,a.emailaddress from account a  ";
		
		return jdbcTemplate.queryForList(query);
	}






}
