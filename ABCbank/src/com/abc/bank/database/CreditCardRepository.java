package com.abc.bank.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abc.bank.domain.CreditCard;
import com.abc.bank.enums.CardProcessor;

//create 15 credit card objects 
public class CreditCardRepository {
	public CreditCard getCreditCardCustomerId(Integer CustomerId) {
		CreditCard creditCard1 = new CreditCard();
		creditCard1.setCreditCardNumber(12345678912l);
		creditCard1.setCardType("AMEX");
		creditCard1.setCardProcessor(CardProcessor.MASTER);
		creditCard1.setCvv(111);
		creditCard1.setExpireDate("12/01/2023");
		creditCard1.setName("Naveen Kumar");

		// credit card object 2
		CreditCard creditCard2 = new CreditCard();
		creditCard2.setCreditCardNumber(123456789122l);
		creditCard2.setCardType("Bank Of America");
		creditCard2.setCardProcessor(CardProcessor.VISA);
		creditCard2.setCvv(122);
		creditCard2.setExpireDate("01/02/2023");
		creditCard2.setName("Sailesh Kumar");

		// credit card object 3
		CreditCard creditCard3 = new CreditCard();
		creditCard3.setCreditCardNumber(123456789123l);
		creditCard3.setCardType("Discover");
		creditCard3.setCardProcessor(CardProcessor.VISA);
		creditCard3.setCvv(123);
		creditCard3.setExpireDate("02/02/2023");
		creditCard3.setName("Rakesh Reddy");

		// credit card object 4
		CreditCard creditCard4 = new CreditCard();
		creditCard4.setCreditCardNumber(123456789124l);
		creditCard4.setCardType("Capital One");
		creditCard4.setCardProcessor(CardProcessor.VISA);
		creditCard4.setCvv(124);
		creditCard4.setExpireDate("03/03/2023");
		creditCard4.setName("Girish Podapati");

		// credit card object 5
		CreditCard creditCard5 = new CreditCard();
		creditCard5.setCreditCardNumber(123456789125l);
		creditCard5.setCardType("ICICI");
		creditCard5.setCardProcessor(CardProcessor.RUPAY);
		creditCard5.setCvv(125);
		creditCard5.setExpireDate("04/04/2023");
		creditCard5.setName("Srikanth Palamoor");

		// credit card object 6
		CreditCard creditCard6 = new CreditCard();
		creditCard6.setCreditCardNumber(123456789126l);
		creditCard6.setCardType("Citi Bank");
		creditCard6.setCardProcessor(CardProcessor.VISA);
		creditCard6.setCvv(126);
		creditCard6.setExpireDate("12/03/2023");
		creditCard6.setName("Linda Mellisa");

		// credit card object 7
		CreditCard creditCard7 = new CreditCard();
		creditCard7.setCreditCardNumber(123456789127l);
		creditCard7.setCardType("USAA");
		creditCard7.setCardProcessor(CardProcessor.VISA);
		creditCard7.setCvv(127);
		creditCard7.setExpireDate("30/03/2025");
		creditCard7.setName("John Feddy");

		// credit card object 8
		CreditCard creditCard8 = new CreditCard();
		creditCard8.setCreditCardNumber(123456789128l);
		creditCard8.setCardType("Mastercard");
		creditCard8.setCardProcessor(CardProcessor.VISA);
		creditCard8.setCvv(128);
		creditCard8.setExpireDate("19/03/2022");
		creditCard8.setName("Kim Lan");

		// credit card object 9
		CreditCard creditCard9 = new CreditCard();
		creditCard9.setCreditCardNumber(123456789129l);
		creditCard9.setCardType("SBI");
		creditCard9.setCardProcessor(CardProcessor.VISA);
		creditCard9.setCvv(129);
		creditCard9.setExpireDate("11/05/2024");
		creditCard9.setName("Jim Kon");

		// credit card object 10
		CreditCard creditCard10 = new CreditCard();
		creditCard10.setCreditCardNumber(123456789126l);
		creditCard10.setCardType("Kotak Bank");
		creditCard10.setCardProcessor(CardProcessor.VISA);
		creditCard10.setCvv(130);
		creditCard10.setExpireDate("10/11/2024");
		creditCard10.setName("Sravani Pipalla");
		// adding customer objects to the list
		Map<Integer, CreditCard> creditCardListMap = new HashMap<>();
		creditCardListMap.put(123450, creditCard1);
		creditCardListMap.put(123451, creditCard2);
		creditCardListMap.put(123453, creditCard3);
		creditCardListMap.put(123454, creditCard4);
		creditCardListMap.put(123455, creditCard5);
		creditCardListMap.put(123456, creditCard6);
		creditCardListMap.put(123457, creditCard7);
		creditCardListMap.put(123458, creditCard8);
		creditCardListMap.put(123459, creditCard9);

		return creditCardListMap.get(CustomerId);

	}

}
