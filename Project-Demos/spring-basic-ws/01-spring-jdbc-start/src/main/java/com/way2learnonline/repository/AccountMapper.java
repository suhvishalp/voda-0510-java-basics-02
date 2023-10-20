package com.way2learnonline.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.way2learnonline.model.Account;

	public class AccountMapper implements RowMapper<Account> {
	
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account=new Account();
			account.setAccountNumber(rs.getLong("accountNumber"));
			account.setName(rs.getString("name"));
			account.setActive(rs.getBoolean("isActive"));
			account.setBalance(rs.getInt("balance"));
			account.setEmailAddress(rs.getString("emailAddress"));
			
			return account;
		}
	
	}

	