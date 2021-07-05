package com.abc.bank.database;

import java.util.Comparator;

import com.abc.bank.domain.Customer;

public class CustomerNameSorter implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {

		return customer1.getCustFirstName().compareTo(customer2.getCustFirstName());
	}

}
