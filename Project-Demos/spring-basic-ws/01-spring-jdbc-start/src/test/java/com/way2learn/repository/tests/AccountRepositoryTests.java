package com.way2learn.repository.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.config.ApplicationConfig;
import com.way2learnonline.config.InfrastructureConfig;
import com.way2learnonline.model.Account;
import com.way2learnonline.repository.AccountRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class,InfrastructureConfig.class})
public class AccountRepositoryTests {
	
	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void testGetAccountByNumberAsMap() throws SQLException{
		Map<String, Object> accountMap=	accountRepository.getAccountByNumberAsMap(new Long(1));
		
		assertNotNull(accountMap);
		assertEquals(new Long(1), accountMap.get("accountnumber"));
		
	}
	
	@Test
	public void testGetAccountByNumber() throws SQLException{
		Account account=	accountRepository.findAccountByNumber(new Long(1));		
		assertNotNull(account);		
		assertEquals(new Long(1), account.getAccountNumber());		
	}
	
	@Test
	public void testGetAllAccountsAsMap() throws SQLException{
		List<Map<String, Object>>  accountList=	accountRepository.getAllAccountsAsMap();		
		assertNotNull(accountList);		
		assertEquals(2, accountList.size());
		
	}
	
	@Test
	public void testfindNameByAccountNumber() throws SQLException{
		String name=	accountRepository.findNameByAccountNumber(new Long(1));		
		assertNotNull(name);		
		assertEquals("shiva", name);		
	}
	
	@Test
	public void testfindAllAccounts() throws SQLException{
		List<Account> accountList=	accountRepository.findAllAccounts();		
		assertNotNull(accountList);		
		assertEquals(2, accountList.size());	
	}
	

}
