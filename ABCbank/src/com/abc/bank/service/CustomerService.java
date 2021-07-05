package com.abc.bank.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.abc.bank.database.CustomerRepository;
import com.abc.bank.domain.Address;
import com.abc.bank.domain.Customer;

public class CustomerService {
	// ssn customer id, should pull both credit card and debit card
	public List<Customer> getAllCustomers() {
		CustomerRepository repository = new CustomerRepository();
		return repository.getCustomers();
	}

	public Customer getCustomerById(int customerId) {
		Customer customer = null;
		/*CustomerRepository repository = new CustomerRepository();
		List<Customer> customerList = repository.getCustomers();*/
		List<Customer> customerList = getAllCustomers();
		Iterator iterator = customerList.iterator();
		while(iterator.hasNext()){
		Customer cust =	(Customer) iterator.next();
			if (cust.getCustomerId() == customerId) {
				customer = cust;
			}
		}
		/*List<Customer> customerList = getAllCustomers();
		for (Customer cust : customerList) {
			if (cust.getCustomerId() == customerId) {
				customer = cust;
			}
		}*/
		return customer;
	}

	public Customer getCustomerBySsn(int customerSsn) {
		Customer customer = null;
		/*CustomerRepository repository = new CustomerRepository();
		List<Customer> customerList = repository.getCustomers();*/
		List<Customer> customerList = getAllCustomers();
		for (Customer cust : customerList) {
			if (cust.getSsn() == customerSsn) {
				customer = cust;
			}
		}
		return customer;
	}

	public Customer getCustomerByPersonalPhoneNumber(int customerPersonalPhoneNumber) {
		Customer customer1 = null;
		/*CustomerRepository repository1 = new CustomerRepository();
		List<Customer> customerList1 = repository1.getCustomers();*/
		List<Customer> customerList = getAllCustomers();
		for (Customer cust : customerList) {
			if (cust.getPersonalPhoneNumber() == customerPersonalPhoneNumber) {
				customer1 = cust;
			}
		}
		return customer1;
	}

	public List<Customer> getCustomerByAddress(String customerAddress) {
		List<Customer> customer = new ArrayList<>();
		/*CustomerRepository repository2 = new CustomerRepository();
		repository2.getCustomers();
		List<Customer> customerList2 = repository2.getCustomers();*/
		List<Customer> customerList = getAllCustomers();
		for (Customer cust : customerList) {
			Address address = cust.getAddress();
			if (address.getAddressLine1().contains(customerAddress)) {
				customer.add(cust);
			}
		}
		return customer;
	}

	public List<Customer> getCustomerByZipCode(int zipCode) {
		List<Customer> customer = new ArrayList<>();
		/*CustomerRepository repository3 = new CustomerRepository();
		repository3.getCustomers();
		List<Customer> customerList3 = repository3.getCustomers();*/
		List<Customer> customerList = getAllCustomers();
		for (Customer cus : customerList) {
			Address address = cus.getAddress();
			if (address.getZipCode() == zipCode) {
				customer.add(cus);
			}
		}
		return customer;
	}

	public List<Customer> getCustomerByState(String state) {
		CustomerRepository respository4 = new CustomerRepository();
		return respository4.getCustomers().stream().filter(x -> x.getAddress().getState().equalsIgnoreCase(state))
				.collect(Collectors.toList());
	}
	public List<Customer> getCustomerByCity(String city) {
		CustomerRepository respository4 = new CustomerRepository();
		return respository4.getCustomers().stream().filter(x -> x.getAddress().getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
	}
	
}
