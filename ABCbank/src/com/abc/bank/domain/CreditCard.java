package com.abc.bank.domain;

import com.abc.bank.enums.CardProcessor;
import com.abc.bank.enums.DebitCardType;

public class CreditCard {
	private long creditCardNumber;
	private String name;
	private String cardType;
	private CardProcessor cardProcessor;
	private String expireDate;
	private int cvv;
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public CardProcessor getCardProcessor() {
		return cardProcessor;
	}
	public void setCardProcessor(CardProcessor cardProcessor) {
		this.cardProcessor = cardProcessor;
	}
	
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardProcessor == null) ? 0 : cardProcessor.hashCode());
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + cvv;
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (cardProcessor != other.cardProcessor)
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (cvv != other.cvv)
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", name=" + name + ", cardType=" + cardType
				+ ", cardProcessor=" + cardProcessor + ", expireDate=" + expireDate + ", cvv=" + cvv + "]";
	}
	
	

}
