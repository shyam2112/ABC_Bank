package com.abc.bank.database;

import java.util.ArrayList;
import java.util.List;

import com.abc.bank.enums.TransactionType;

public class TransactionRepository {
	public List<CustomerTransaction> getCustomerTransactions(){
		CustomerTransaction transaction = new CustomerTransaction();
		transaction.setCustomerId(123450);
		transaction.setSavingAccountNumber(112233);
		transaction.setTransactionAmount(5000);
		transaction.setTransactionDate("01/05/2021");
		transaction.setTransactionType(TransactionType.BANK_WITHDRAWL);
		CustomerTransaction transaction2 = new CustomerTransaction();
		transaction2.setCustomerId(123450);
		transaction2.setSavingAccountNumber(112233);
		transaction2.setTransactionAmount(1000);
		transaction2.setTransactionDate("11/05/2021");
		transaction2.setTransactionType(TransactionType.ATM_DEPOSIT);
		CustomerTransaction transaction3 = new CustomerTransaction();
		transaction3.setCustomerId(123450);
		transaction3.setSavingAccountNumber(112233);
		transaction3.setTransactionAmount(25000);
		transaction3.setTransactionDate("05/05/2021");
		transaction3.setTransactionType(TransactionType.BANK_WITHDRAWL);
		CustomerTransaction transaction4 = new CustomerTransaction();
		transaction4.setCustomerId(123450);
		transaction4.setSavingAccountNumber(112233);
		transaction4.setTransactionAmount(5000);
		transaction4.setTransactionDate("01/05/2021");
		transaction4.setTransactionType(TransactionType.BANK_WITHDRAWL);
		CustomerTransaction transaction5 = new CustomerTransaction();
		transaction5.setCustomerId(123450);
		transaction5.setSavingAccountNumber(112233);
		transaction5.setTransactionAmount(1500);
		transaction5.setTransactionDate("31/05/2021");
		transaction5.setTransactionType(TransactionType.CHECK_DEPOSIT);
		CustomerTransaction transaction6 = new CustomerTransaction();
		transaction6.setCustomerId(123451);
		transaction6.setSavingAccountNumber(112231);
		transaction6.setTransactionAmount(35000);
		transaction6.setTransactionDate("11/05/2021");
		transaction6.setTransactionType(TransactionType.BANK_WITHDRAWL);
		CustomerTransaction transaction7 = new CustomerTransaction();
		transaction7.setCustomerId(123451);
		transaction7.setSavingAccountNumber(112231);
		transaction7.setTransactionAmount(9500);
		transaction7.setTransactionDate("11/01/2021");
		transaction7.setTransactionType(TransactionType.ATM_WITHDRAWL);
		CustomerTransaction transaction8 = new CustomerTransaction();
		transaction8.setCustomerId(123451);
		transaction8.setSavingAccountNumber(112231);
		transaction8.setTransactionAmount(11500);
		transaction8.setTransactionDate("11/05/2021");
		transaction8.setTransactionType(TransactionType.CHECK_DEPOSIT);
		List<CustomerTransaction> customerTransactionList = new ArrayList<>();
		customerTransactionList.add(transaction);
		customerTransactionList.add(transaction2);
		customerTransactionList.add(transaction3);
		customerTransactionList.add(transaction4);
		customerTransactionList.add(transaction5);
		customerTransactionList.add(transaction6);
		customerTransactionList.add(transaction7);
		customerTransactionList.add(transaction8);
		
		return customerTransactionList;
		
	}

}
