package com.way2learnonline.service;

import java.sql.SQLException;
import java.util.List;

import com.way2learnonline.model.Account;


public interface BankService {
	
	public Long transfer(Long fromAccount,Long toAccount,int amount) throws SQLException;
	

}
