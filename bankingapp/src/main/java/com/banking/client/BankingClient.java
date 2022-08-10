package com.banking.client;

import java.util.ArrayList;
import java.util.List;

import com.banking.dao.BankingDAOImpl;
import com.banking.entity.Account;
import com.banking.entity.Employee;

public class BankingClient {

	public static void main(String args[]) {
		
		BankingDAOImpl bankingDAOImpl = new BankingDAOImpl();
		
		Account account1 = new Account();
		account1.setAccountNumber("1234567890");

		Account account2 = new Account();
		account2.setAccountNumber("9876543210");


		//Add new Employee object
		Employee employee = new Employee();
		employee.setEmployeeName("John Mike");
		

		List<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);
		
		employee.setAccounts(accountList);
		
		bankingDAOImpl.saveDetails(employee);
	}
}
