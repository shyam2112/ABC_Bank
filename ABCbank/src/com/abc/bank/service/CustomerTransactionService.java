package com.abc.bank.service;

import java.util.ArrayList;
import java.util.List;

import com.abc.bank.database.CustomerTransaction;
import com.abc.bank.database.TransactionRepository;
import com.abc.bank.enums.TransactionType;

public class CustomerTransactionService {
	//
	/**
	 * @param accountNo
	 * @return List<CustomerTransaction>
	 */
	public List<CustomerTransaction> getCustTransDetailsByAccountNo(int accountNo) {
		List<CustomerTransaction> custTransactionList = new ArrayList<>();
		TransactionRepository transactionRepository = new TransactionRepository();
		List<CustomerTransaction> transaction = transactionRepository.getCustomerTransactions();
		for (CustomerTransaction trans : transaction) {
			if (trans.getSavingAccountNumber() == accountNo) {
				custTransactionList.add(trans);
			}
		}
		return custTransactionList;

	}

	public List<CustomerTransaction> getTransDetailsByTransType(int accountNo, TransactionType type) {
		List<CustomerTransaction> custTransactionList = new ArrayList<>();
		TransactionRepository transactionRepository = new TransactionRepository();
		List<CustomerTransaction> transaction = transactionRepository.getCustomerTransactions();
		for (CustomerTransaction trans : transaction) {
			if (trans.getSavingAccountNumber() == accountNo && trans.getTransactionType().equals(type)) {
				custTransactionList.add(trans);
			}
		}

		return custTransactionList;

	}

	public <TransactionDate> List<CustomerTransaction> getTransDetailsByTransDate(int accountNo, TransactionDate  date){
List<CustomerTransaction> custTransactionList = new ArrayList<>();
TransactionRepository transactionRepository = new TransactionRepository();
List<CustomerTransaction> transaction = transactionRepository.getCustomerTransactions();
for(CustomerTransaction trans: transaction){
	if(trans.getSavingAccountNumber() == accountNo && trans.getTransactionDate().equals(date)){
		custTransactionList.add(trans);
	}
}
return custTransactionList;

	}
}

