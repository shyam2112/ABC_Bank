package com.abc.bank.database;

import java.util.Comparator;

import com.abc.bank.domain.Customer;

public class CustomerBalanceSorter  implements Comparator<Customer>{

	@Override
	public int compare(Customer customer1, Customer customer2) {
		return customer1.getSavingAccount().getBalance()- customer2.getSavingAccount().getBalance();
	}
	

}
