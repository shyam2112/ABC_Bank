package com.abc.bank.test;

import java.util.Scanner;

import com.abc.bank.domain.Customer;
import com.abc.bank.service.CustomerService;

public class AtmSimulatorTest {
	public static void main(String agrs[]) {
		CustomerService customerService = new CustomerService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter CustomerId");
		int customerId = sc.nextInt();
		System.out.println("Please Enter CustomerPin");
		int customerPin = sc.nextInt();
		System.out.println("*************************");
		Customer customer = customerService.getCustomerById(customerId);
		// System.out.println(customer.toString());
		if (customerPin == 1234) {
			int balance = customer.getSavingAccount().getBalance();
			System.out.println("Your Balance Amount is :  " + balance);
			
		} else{
			System.out.println("You Have Entered Wrong Pin");

		}

	}

}
