package com.abc.bank.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.abc.bank.database.CustomerNameSorter;
import com.abc.bank.database.CustomerBalanceSorter;
import com.abc.bank.domain.Customer;
import com.abc.bank.service.CustomerService;

public class CustomerServiceTest {
	public static void main(String agrs[]) {
		CustomerService customerService = new CustomerService();
		List<Customer> customerList = customerService.getAllCustomers();
		//name sorter 
	//	Collections.sort(customerList, new CustomerNameSorter());
		//balance sorter
	//Collections.sort(customerList, new CustomerBalanceSorter());
	
		for (Customer cust : customerList) {
			System.out.println(cust.toString());
		}

		System.out.println("*************************");
		Customer customer = customerService.getCustomerById(123459);
		System.out.println(customer.toString());

		System.out.println("*************************");
		Customer customer6 = customerService.getCustomerBySsn(1255);
		System.out.println(customer6.toString());

		System.out.println("*************************");
		Customer customer7 = customerService.getCustomerByPersonalPhoneNumber(91232137);
		System.out.println(customer7.toString());
		
		System.out.println("*************************");
		List<Customer> customerAddressList = customerService.getCustomerByAddress("Avenue");
		for(Customer cust :customerAddressList){
			System.out.println(cust.toString());
		}
		System.out.println("*************************");
		List<Customer> customerZipCode = customerService.getCustomerByZipCode(967017);
		for(Customer cus :customerZipCode){
			System.out.println(cus.toString());
		}
		
		System.out.println("*************************");
		int numberOfCustomers = customerZipCode.size();
		System.out.println("Number Of Customers in ZipCode" +  numberOfCustomers);
		
		System.out.println("*************************");
		int numberOfCustomersInAddress = customerAddressList.size();
		System.out.println("Number of Customer in Address" + numberOfCustomersInAddress);
		System.out.println("*************************");
		List<Customer> customerByState = customerService.getCustomerByState("CA");
		customerByState.stream().forEach(System.out::println);
		System.out.println("*************************");
		List<Customer> customerByCity = customerService.getCustomerByCity("Fremont");
		customerByCity.stream().forEach(System.out::println);
		
		
		
	}
	
	
}
