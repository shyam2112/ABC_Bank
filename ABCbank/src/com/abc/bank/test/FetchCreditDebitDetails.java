package com.abc.bank.test;

import com.abc.bank.database.CreditCardRepository;
import com.abc.bank.database.DebitCardRepository;
import com.abc.bank.domain.CreditCard;
import com.abc.bank.domain.Customer;
import com.abc.bank.domain.DebitCard;
import com.abc.bank.service.CustomerService;

public class FetchCreditDebitDetails {
	public static void main(String args[]){
		//created customer service object 
		CustomerService customerService = new CustomerService();
		//fetched customer by ssn no
		Customer customer = customerService.getCustomerBySsn(1211);
		System.out.println(customer.toString());
		int custId = customer.getCustomerId();
		//created customer repository object 
		CreditCardRepository creditCardRepository = new CreditCardRepository();
		//fetched credit card details by customer Id
		CreditCard creditCard = creditCardRepository.getCreditCardCustomerId(custId);
		//created debit card object repository 
		DebitCardRepository debitCardRepository  = new DebitCardRepository();
		//fetched debit card details by customer Id
		DebitCard debitCard = debitCardRepository.getDebitCard(custId);
		System.out.println(creditCard.toString());
		System.out.println(debitCard.toString());



	}

}
