/**
 * 
 */
package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.Account;


public class AccountInMemoryImpl implements AccountDao {
	private final Map<String, Account> accountsByNumber = new HashMap <String, Account>();
  
	
	@Override
	public void createAccount(Account account) {
		if (accountsByNumber.containsKey(account.getAccountNumber())) {
			throw new IllegalArgumentException("account [" + account.getAccountNumber() + "] already exists");
		}
		accountsByNumber.put(account.getAccountNumber(), new Account(account));
	}

	
	@Override
	public Account getAccount(String accountNumber) {
		Account acc = accountsByNumber.get(accountNumber);
		 return new Account(acc);
	}

	
	@Override
	public List<Account> getAllAccounts() {
		List<Account> allAccounts = new ArrayList<Account>();
		for (Account account : accountsByNumber.values())
			allAccounts.add(new Account(account));
		return allAccounts;
	}

	
	@Override
	public void updateAccount(Account account) {
		if (!accountsByNumber.containsKey(account.getAccountNumber())) {
			throw new IllegalArgumentException("account [" 
								+ account.getAccountNumber( ) + "] not found");
		}
		accountsByNumber.put(account.getAccountNumber(),new Account(account));
	}


}
