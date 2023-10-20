package com.way2learnonline.service;

import java.sql.SQLException;


public interface BankService {
	
	public Long transfer(Long fromAccount,Long toAccount,int amount) throws SQLException;
	

}
