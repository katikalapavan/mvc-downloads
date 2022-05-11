/**
 * 
 */
package com.dao;

import java.util.List;

import com.entity.Account;

 
public class AccountDaoJdbcImpl implements AccountDao {

	 
	@Override
	public void createAccount(Account account) {
		System.out.println("under construction [JDBC impl]");

	}

	 
	@Override
	public Account getAccount(String accountNumber) {
		System.out.println("under construction [JDBC impl]");
		return null;
	}

	  
	@Override
	public List<Account> getAllAccounts() {
		System.out.println("under construction [JDBC impl]");
		return null;
	}

	 
	@Override
	public void updateAccount(Account account) {
		System.out.println("under construction [JDBC impl]");
	}

}
