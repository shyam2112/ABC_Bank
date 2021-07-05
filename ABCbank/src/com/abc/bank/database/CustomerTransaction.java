package com.abc.bank.database;

import com.abc.bank.enums.TransactionType;

public class CustomerTransaction {
	private int customerId;
	private int transactionAmount;
	private int savingAccountNumber;
	private String transactionDate;
	private TransactionType transactionType;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getSavingAccountNumber() {
		return savingAccountNumber;
	}
	public void setSavingAccountNumber(int savingAccountNumber) {
		this.savingAccountNumber = savingAccountNumber;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "CustomerTransaction [customerId=" + customerId + ", transactionAmount=" + transactionAmount
				+ ", savingAccountNumber=" + savingAccountNumber + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + "]";
	}

}
