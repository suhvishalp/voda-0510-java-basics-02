package com.demo.repository;

import java.sql.SQLException;
import java.util.List;

import com.demo.model.TransactionDetail;



public interface TransactionRepository {

	public Long addTransaction(TransactionDetail transactionDetail) throws SQLException;
	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(Long accountNumber) throws SQLException;
}
