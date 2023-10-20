package com.way2learnonline.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.way2learnonline.model.TransactionDetail;


public class JdbcTransactionRepositoryImpl implements TransactionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	public Long addTransaction(TransactionDetail transactionDetail) throws SQLException {
		System.out.println("Adding transaction : "+transactionDetail.getTxType());
		String query="insert into TransactionDetail(accountnumber,transactiondate,amount,txtype) values(?,?,?,?) ";
		jdbcTemplate.update(query,transactionDetail.getAccountNumber(),transactionDetail.getTransactionDate(),
				transactionDetail.getAmount(),transactionDetail.getTxType().toString());
		
		
		return null;
	}

	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(Long accountNumber) throws SQLException {
		String query="select * from TransactionDetail td where td.accountNumber=?";
		
	return jdbcTemplate.query(query, new BeanPropertyRowMapper<TransactionDetail>(TransactionDetail.class));
	}

	
	
	

}
