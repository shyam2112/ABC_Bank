package com.abc.bank.domain;

public class SavingAccount {
	 private  int accountNumber;
	 private int minimumBalance;
	 private int balance;
	 private int ifscCode;
	 private int routingNumber;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	public int getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", minimumBalance=" + minimumBalance + ", balance="
				+ balance + ", ifscCode=" + ifscCode + ", routingNumber=" + routingNumber + "]";
	}
	
	  
	 

}
