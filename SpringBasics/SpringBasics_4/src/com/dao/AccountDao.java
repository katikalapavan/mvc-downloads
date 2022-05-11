/**
 * 
 */
package com.dao;

import java.util.List;

import com.entity.Account;


public interface AccountDao {
	public void createAccount(Account account);
	public Account getAccount(String accountNumber);
	public List<Account> getAllAccounts();
	public void updateAccount(Account account);
}
