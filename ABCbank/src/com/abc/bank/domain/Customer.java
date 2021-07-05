package com.abc.bank.domain;
//class name always start  with capital letter 
//pojo class contains private instance variables & public getters and setter methods
public class Customer {
	
	private int customerId;
	private String custFirstName;
	private String custMiddleName;
	private String custLastName;
	private int  ssn;
	private Address address;
	private String dateOfBirth;
	private String eMail;
	private int personalPhoneNumber;
	private int workPhoneNumber;
	private SavingAccount savingAccount;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustMiddleName() {
		return custMiddleName;
	}
	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getPersonalPhoneNumber() {
		return personalPhoneNumber;
	}
	public void setPersonalPhoneNumber(int personalPhoneNumber) {
		this.personalPhoneNumber = personalPhoneNumber;
	}
	public int getWorkPhoneNumber() {
		return workPhoneNumber;
	}
	public void setWorkPhoneNumber(int workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custFirstName=" + custFirstName + ", custMiddleName="
				+ custMiddleName + ", custLastName=" + custLastName + ", ssn=" + ssn + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", eMail=" + eMail + ", personalPhoneNumber=" + personalPhoneNumber
				+ ", workPhoneNumber=" + workPhoneNumber + ", savingAccount=" + savingAccount + "]";
	}
	
	
	


	

}
