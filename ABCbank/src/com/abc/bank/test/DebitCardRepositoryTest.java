package com.abc.bank.test;

import com.abc.bank.database.DebitCardRepository;
import com.abc.bank.domain.DebitCard;

public class DebitCardRepositoryTest {
	public static void main(String agrs[]){
		DebitCardRepository debitCard  = new DebitCardRepository();
		DebitCard card = debitCard.getDebitCard(123450);
		System.out.println( card.toString());
	}
	

}
