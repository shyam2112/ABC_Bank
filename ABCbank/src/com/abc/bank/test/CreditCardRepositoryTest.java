package com.abc.bank.test;

import com.abc.bank.database.CreditCardRepository;
import com.abc.bank.domain.CreditCard;

public class CreditCardRepositoryTest {
	public static void main(String agrs[]){
		CreditCardRepository creditCard = new CreditCardRepository();
		CreditCard card = creditCard.getCreditCardCustomerId(123456);
		System.out.println(card.toString());

	}

}
