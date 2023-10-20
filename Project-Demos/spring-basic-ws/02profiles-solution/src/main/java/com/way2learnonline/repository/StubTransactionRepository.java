package com.way2learnonline.repository;

import java.sql.SQLException;
import java.util.List;

import com.way2learnonline.model.TransactionDetail;



public class StubTransactionRepository implements TransactionRepository {

	public Long addTransaction(TransactionDetail transactionDetail)
			throws SQLException {
		System.out.println("StubTransactionRepository.addTransaction()");
		return new Long(123);
	}

	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(
			Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
