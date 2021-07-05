package com.abc.bank.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.abc.bank.database.CustomerTransaction;
import com.abc.bank.enums.TransactionType;
import com.abc.bank.service.CustomerTransactionService;

public class TransactionTest {
	public static void main(String agrs[]) {
		CustomerTransactionService service = new CustomerTransactionService();
		Set<Integer> transactionAmountSet = new TreeSet<>();
		List<CustomerTransaction> custTransList = service.getCustTransDetailsByAccountNo(112233);
		for (CustomerTransaction custTrans : custTransList) {
			transactionAmountSet.add(custTrans.getTransactionAmount());
			System.out.println(custTrans.toString());
		}
		System.out.println("*****************************************");
		for (Integer transAmount : transactionAmountSet) {
			System.out.println(transAmount);
		}
		System.out.println("*****************************************");
		System.out.println("calling Get Transaction details with Account no and transaction type");
		List<CustomerTransaction> custTransDetailList = service.getTransDetailsByTransType(112233, TransactionType.BANK_WITHDRAWL);
		custTransDetailList.stream().forEach(System.out:: println);
		System.out.println("*****************************************");
		System.out.println("calling Get Transaction details with Account no and transaction date");
		List<CustomerTransaction> custTransDetailList1 = service.getTransDetailsByTransDate(112233, "01/05/2021");
		custTransDetailList1.stream().forEach(System.out:: println);
	}

}
