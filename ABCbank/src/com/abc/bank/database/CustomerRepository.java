package com.abc.bank.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.abc.bank.domain.Address;
import com.abc.bank.domain.Customer;
import com.abc.bank.domain.SavingAccount;
import com.abc.bank.enums.AddressType;

public class CustomerRepository {
	public List<Customer> getCustomers() {
		List<Customer> customerList = new ArrayList<>();
		// saving Account details for customer 1
		SavingAccount savingAccount1 = new SavingAccount();
		savingAccount1.setAccountNumber(112233);
		savingAccount1.setIfscCode(1122);
		savingAccount1.setMinimumBalance(5000);
		savingAccount1.setBalance(10000);
		savingAccount1.setRoutingNumber(112244);
		// Address details for customer 1
		Address address1 = new Address();
		address1.setAddressLine1("Vista Club Avenue");
		address1.setAddressLine2("Club Circle");
		address1.setAddressType(AddressType.HOME_ADDRESS);
		address1.setCity("Santa Clara");
		address1.setState("CA");
		address1.setCountry("USA");
		address1.setZipCode(950012);
		// customer 1 details
		Customer customer1 = new Customer();
		customer1.setCustFirstName("Naveen");
		customer1.setCustLastName("Kumar");
		customer1.setCustMiddleName("Ammanola");
		customer1.setCustomerId(123450);
		customer1.setDateOfBirth("12-01-1991");
		customer1.seteMail("naveenkumar@gmail.com");
		customer1.setPersonalPhoneNumber(91232131);
		customer1.setSsn(1211);
		customer1.setWorkPhoneNumber(91232132);
		customer1.setAddress(address1);
		customer1.setSavingAccount(savingAccount1);

		// Adding customer to the list

		customerList.add(customer1);

		// saving Account details for customer 1
		SavingAccount savingAccount2 = new SavingAccount();
		savingAccount2.setAccountNumber(112231);
		savingAccount2.setIfscCode(1121);
		savingAccount2.setMinimumBalance(5001);
		savingAccount2.setBalance(20000);
		savingAccount2.setRoutingNumber(112241);
		// Address details for customer 2
		Address address2 = new Address();
		address2.setAddressLine1("Camden Avenue 10");
		address2.setAddressLine2("Avenue");
		address2.setAddressType(AddressType.HOME_ADDRESS);
		address2.setCity("Fremont");
		address2.setState("CA");
		address2.setCountry("USA");
		address2.setZipCode(950123);
		// customer 2 details

		Customer customer2 = new Customer();
		customer2.setCustFirstName("Sailesh");
		customer2.setCustLastName("Kunddam");
		customer2.setCustMiddleName("Kumar");
		customer2.setCustomerId(123451);
		customer2.setDateOfBirth("20-11-1992");
		customer2.seteMail("saileshkumar@gmail.com");
		customer2.setPersonalPhoneNumber(91232132);
		customer2.setSsn(1222);
		customer2.setWorkPhoneNumber(91232131);
		customer2.setAddress(address2);
		customer2.setSavingAccount(savingAccount2);
		// Adding customer to the list

		customerList.add(customer2);

		// saving Account details for customer 3
		SavingAccount savingAccount3 = new SavingAccount();
		savingAccount3.setAccountNumber(112233);
		savingAccount3.setIfscCode(1123);
		savingAccount3.setMinimumBalance(5003);
		savingAccount3.setBalance(50000);
		savingAccount3.setRoutingNumber(112243);
		// Address details for customer 3
		Address address3 = new Address();
		address3.setAddressLine1("Clifton Avenue 12");
		address3.setAddressLine2("Blvd");
		address3.setAddressType(AddressType.HOME_ADDRESS);
		address3.setCity("Cleveland");
		address3.setState("OH");
		address3.setCountry("USA");
		address3.setZipCode(441002);
		// customer 2 details

		Customer customer3 = new Customer();
		customer3.setCustFirstName("Rakesh");
		customer3.setCustLastName("Reddy");
		customer3.setCustMiddleName("Munne");
		customer3.setCustomerId(123453);
		customer3.setDateOfBirth("20-07-1991");
		customer3.seteMail("rakeshreddy@gmail.com");
		customer3.setPersonalPhoneNumber(91232133);
		customer3.setSsn(1233);
		customer3.setWorkPhoneNumber(91232132);
		customer3.setAddress(address3);
		customer3.setSavingAccount(savingAccount3);
		// Adding customer to the list

		customerList.add(customer3);

		// saving Account details for customer 4
		SavingAccount savingAccount4 = new SavingAccount();
		savingAccount4.setAccountNumber(112234);
		savingAccount4.setIfscCode(1124);
		savingAccount4.setMinimumBalance(5004);
		savingAccount4.setBalance(40000);
		savingAccount4.setRoutingNumber(112244);
		// Address details for customer 4
		Address address4 = new Address();
		address4.setAddressLine1("Edward St");
		address4.setAddressLine2("N 2nd St");
		address4.setAddressType(AddressType.HOME_ADDRESS);
		address4.setCity("Easton");
		address4.setState("MD");
		address4.setCountry("USA");
		address4.setZipCode(221004);
		// customer 4 details

		Customer customer4 = new Customer();
		customer4.setCustFirstName("Girish");
		customer4.setCustLastName("Podapati");
		customer4.setCustMiddleName("Sai");
		customer4.setCustomerId(123454);
		customer4.setDateOfBirth("10-07-1990");
		customer4.seteMail("girishsai@gmail.com");
		customer4.setPersonalPhoneNumber(91232134);
		customer4.setSsn(1244);
		customer4.setWorkPhoneNumber(91232144);
		customer4.setAddress(address4);
		customer4.setSavingAccount(savingAccount4);
		// Adding customer to the list

		customerList.add(customer4);

		// saving Account details for customer 5
		SavingAccount savingAccount5 = new SavingAccount();
		savingAccount5.setAccountNumber(112235);
		savingAccount5.setIfscCode(1125);
		savingAccount5.setMinimumBalance(5005);
		savingAccount5.setBalance(45000);
		savingAccount5.setRoutingNumber(112245);
		// Address details for customer 5
		Address address5 = new Address();
		address5.setAddressLine1("Westoak Apartments");
		address5.setAddressLine2("Dover St");
		address5.setAddressType(AddressType.HOME_ADDRESS);
		address5.setCity("Fairfax");
		address5.setState("VA");
		address5.setCountry("USA");
		address5.setZipCode(950005);
		// customer 5 details

		Customer customer5 = new Customer();
		customer5.setCustFirstName("Srikanth");
		customer5.setCustLastName("Reddy");
		customer5.setCustMiddleName("Palamoor");
		customer5.setCustomerId(123455);
		customer5.setDateOfBirth("15-09-1991");
		customer5.seteMail("srikanthreddy@gmail.com");
		customer5.setPersonalPhoneNumber(91232135);
		customer5.setSsn(1255);
		customer5.setWorkPhoneNumber(91232155);
		customer5.setAddress(address5);
		customer5.setSavingAccount(savingAccount5);
		// Adding customer to the list

		customerList.add(customer5);

		// saving Account details for customer 6
		SavingAccount savingAccount6 = new SavingAccount();
		savingAccount6.setAccountNumber(112236);
		savingAccount6.setIfscCode(1126);
		savingAccount6.setMinimumBalance(5006);
		savingAccount6.setBalance(35000);
		savingAccount6.setRoutingNumber(112246);
		// Address details for customer 6
		Address address6 = new Address();
		address6.setAddressLine1("West Hytmner");
		address6.setAddressLine2("High St");
		address6.setAddressType(AddressType.HOME_ADDRESS);
		address6.setCity("OceanGateway");
		address6.setState("MD");
		address6.setCountry("USA");
		address6.setZipCode(210006);
		// customer 6 details

		Customer customer6 = new Customer();
		customer6.setCustFirstName("Linda");
		customer6.setCustLastName("Mellisa");
		customer6.setCustMiddleName("Joo");
		customer6.setCustomerId(123456);
		customer6.setDateOfBirth("15-09-1991");
		customer6.seteMail("lindamellisa@gmail.com");
		customer6.setPersonalPhoneNumber(91232136);
		customer6.setSsn(1266);
		customer6.setWorkPhoneNumber(91232166);
		customer6.setAddress(address5);
		customer6.setSavingAccount(savingAccount5);
		// Adding customer to the list

		customerList.add(customer6);

		// saving Account details for customer 7
		SavingAccount savingAccount7 = new SavingAccount();
		savingAccount7.setAccountNumber(112237);
		savingAccount7.setIfscCode(1127);
		savingAccount7.setMinimumBalance(5007);
		savingAccount7.setBalance(15000);
		savingAccount7.setRoutingNumber(112247);
		// Address details for customer 7
		Address address7 = new Address();
		address7.setAddressLine1("Plam St");
		address7.setAddressLine2("Cross Apartments");
		address7.setAddressType(AddressType.HOME_ADDRESS);
		address7.setCity("Baltimore");
		address7.setState("MD");
		address7.setCountry("USA");
		address7.setZipCode(450007);
		// customer 7 details

		Customer customer7 = new Customer();
		customer7.setCustFirstName("John");
		customer7.setCustLastName("Feddy");
		customer7.setCustMiddleName("Lee");
		customer7.setCustomerId(123457);
		customer7.setDateOfBirth("15-01-1981");
		customer7.seteMail("Johnlee@gmail.com");
		customer7.setPersonalPhoneNumber(91232137);
		customer7.setSsn(1277);
		customer7.setWorkPhoneNumber(91232177);
		customer7.setAddress(address7);
		customer7.setSavingAccount(savingAccount7);
		// Adding customer to the list

		customerList.add(customer7);

		// saving Account details for customer 8
		SavingAccount savingAccount8 = new SavingAccount();
		savingAccount8.setAccountNumber(112238);
		savingAccount8.setIfscCode(1128);
		savingAccount8.setMinimumBalance(5008);
		savingAccount8.setBalance(19000);
		savingAccount8.setRoutingNumber(112248);
		// Address details for customer 8
		Address address8 = new Address();
		address8.setAddressLine1("Cunninghum Dr");
		address8.setAddressLine2("Livermore apt");
		address8.setAddressType(AddressType.HOME_ADDRESS);
		address8.setCity("Hampton");
		address8.setState("VA");
		address8.setCountry("USA");
		address8.setZipCode(757707);
		// customer 8 details

		Customer customer8 = new Customer();
		customer8.setCustFirstName("Kim");
		customer8.setCustLastName("Lan");
		customer8.setCustMiddleName("Kenny");
		customer8.setCustomerId(123458);
		customer8.setDateOfBirth("21-12-1980");
		customer8.seteMail("Kimlan@gmail.com");
		customer8.setPersonalPhoneNumber(91232138);
		customer8.setSsn(1288);
		customer8.setWorkPhoneNumber(91232188);
		customer8.setAddress(address8);
		customer8.setSavingAccount(savingAccount8);
		// Adding customer to the list

		customerList.add(customer8);

		// saving Account details for customer 9
		SavingAccount savingAccount9 = new SavingAccount();
		savingAccount9.setAccountNumber(112239);
		savingAccount9.setIfscCode(1129);
		savingAccount9.setMinimumBalance(5009);
		savingAccount1.setBalance(100000);
		savingAccount9.setRoutingNumber(112249);
		// Address details for customer 9
		Address address9 = new Address();
		address9.setAddressLine1("West Palm St");
		address9.setAddressLine2("Crest Apartments");
		address9.setAddressType(AddressType.HOME_ADDRESS);
		address9.setCity("Union City");
		address9.setState("CA");
		address9.setCountry("USA");
		address9.setZipCode(967017);
		// customer 9 details

		Customer customer9 = new Customer();
		customer9.setCustFirstName("Jim");
		customer9.setCustLastName("Kon");
		customer9.setCustMiddleName("Jenny");
		customer9.setCustomerId(123459);
		customer9.setDateOfBirth("15-02-1975");
		customer9.seteMail("jimkon@gmail.com");
		customer9.setPersonalPhoneNumber(91232139);
		customer9.setSsn(1299);
		customer9.setWorkPhoneNumber(91232199);
		customer9.setAddress(address9);
		customer9.setSavingAccount(savingAccount9);
		// Adding customer to the list

		customerList.add(customer9);
		return customerList;

	}

}
