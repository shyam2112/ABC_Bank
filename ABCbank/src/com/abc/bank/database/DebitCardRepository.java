package com.abc.bank.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abc.bank.domain.DebitCard;
import com.abc.bank.enums.DebitCardType;

//Debt card object 1
public class DebitCardRepository {
	//public access modifier, return type debit card, method name getdebitcard methodparameter customerId
	public DebitCard getDebitCard(Integer customerId) {
		DebitCard debitCard1 = new DebitCard();
		debitCard1.setDebitCardNumber(1234567890l);
		debitCard1.setDebitCardType(DebitCardType.SHOPPER);
		debitCard1.setCvv(123);
		debitCard1.setExpireDate("01/10/2022");
		debitCard1.setCardType("Visa");
		debitCard1.setName("Naveen Kumar");

		// Debt card object 2
		DebitCard debitCard2 = new DebitCard();
		debitCard2.setDebitCardNumber(1234567811l);
		debitCard2.setDebitCardType(DebitCardType.REWARD);
		debitCard2.setCvv(121);
		debitCard2.setExpireDate("02/02/2022");
		debitCard2.setCardType("Visa");
		debitCard2.setName("Sailesh Kumar");

		// Debt card object 3
		DebitCard debitCard3 = new DebitCard();
		debitCard3.setDebitCardNumber(1234567822l);
		debitCard3.setDebitCardType(DebitCardType.REWARD);
		debitCard3.setCvv(122);
		debitCard3.setExpireDate("03/03/2022");
		debitCard3.setCardType("Visa");
		debitCard3.setName("Rakesh Reddy");

		// Debt card object 4
		DebitCard debitCard4 = new DebitCard();
		debitCard4.setDebitCardNumber(1234567833l);
		debitCard4.setDebitCardType(DebitCardType.REWARD);
		debitCard4.setCvv(124);
		debitCard4.setExpireDate("11/04/2023");
		debitCard4.setCardType("Visa");
		debitCard4.setName("Girish Podapati");

		// Debt card object 5
		DebitCard debitCard5 = new DebitCard();
		debitCard5.setDebitCardNumber(1234567844l);
		debitCard5.setDebitCardType(DebitCardType.SHOPPER);
		debitCard5.setCvv(130);
		debitCard5.setExpireDate("15/04/2022");
		debitCard5.setCardType("Visa");
		debitCard5.setName("Srikanth Palamoor");

		// Debt card object 6
		DebitCard debitCard6 = new DebitCard();
		debitCard6.setDebitCardNumber(1234567855l);
		debitCard6.setDebitCardType(DebitCardType.REWARD);
		debitCard6.setCvv(132);
		debitCard6.setExpireDate("12/04/2023");
		debitCard6.setCardType("Visa");
		debitCard6.setName("Linda Mellisa");

		// Debt card object 7
		DebitCard debitCard7 = new DebitCard();
		debitCard7.setDebitCardNumber(1234567866l);
		debitCard7.setDebitCardType(DebitCardType.REWARD);
		debitCard7.setCvv(135);
		debitCard7.setExpireDate("02/11/2022");
		debitCard7.setCardType("Visa");
		debitCard7.setName("John Feddy");

		// Debt card object 8
		DebitCard debitCard8 = new DebitCard();
		debitCard8.setDebitCardNumber(1234567877l);
		debitCard8.setDebitCardType(DebitCardType.SHOPPER);
		debitCard8.setCvv(137);
		debitCard8.setExpireDate("11/09/2022");
		debitCard8.setCardType("Visa");
		debitCard8.setName("Kim Lan");

		// Debt card object 9
		DebitCard debitCard9 = new DebitCard();
		debitCard9.setDebitCardNumber(1234567888l);
		debitCard9.setDebitCardType(DebitCardType.REWARD);
		debitCard9.setCvv(140);
		debitCard9.setExpireDate("30/09/2022");
		debitCard9.setCardType("Visa");
		debitCard9.setName("Jim Kon");

		// Debt card object 10
		DebitCard debitCard10 = new DebitCard();
		debitCard10.setDebitCardNumber(1234567888l);
		debitCard10.setDebitCardType(DebitCardType.SHOPPER);
		debitCard10.setCvv(144);
		debitCard10.setExpireDate("25/10/2022");
		debitCard10.setCardType("Visa");
		debitCard10.setName("Sravani Pipalla");

		// adding customer objects to the list

		Map<Integer, DebitCard> debitCardListMap = new HashMap<>();
		debitCardListMap.put(123450, debitCard1);
		debitCardListMap.put(123451, debitCard2);
		debitCardListMap.put(123453, debitCard3);
		debitCardListMap.put(123454, debitCard4);
		debitCardListMap.put(123455, debitCard5);
		debitCardListMap.put(123456, debitCard6);
		debitCardListMap.put(123457, debitCard7);
		debitCardListMap.put(123458, debitCard8);
		debitCardListMap.put(123459, debitCard9);
		debitCardListMap.put(123456, debitCard10);

		return debitCardListMap.get(customerId);
	}

}
