/**
 * 
 */
package com.entity;

 
public class Account {
	private String accountNumber;
	private String accountOwner;
	private double balance;
	/**
	 * 
	 */
	public Account() {
	}
	/**
	 * @param accountNumber
	 * @param accountOwner
	 * @param balance
	 */
	public Account(String accountNumber, String accountOwner, double balance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	
	public Account(Account acc) {
		this.accountNumber = new String(acc.getAccountNumber());
		this.accountOwner = new String(acc.getAccountOwner());
		this.balance = acc.getBalance();
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountOwner
	 */
	public String getAccountOwner() {
		return accountOwner;
	}
	/**
	 * @param accountOwner the accountOwner to set
	 */
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @param amount
	 */
	public void debit(double amount) {
		balance -= amount;
	}

	/**
	 * @param amount
	 */
	public void credit(double amount) {
		balance += amount;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [" + accountNumber + ", " + accountOwner + ", "
				+ balance + "]";
	}
	
}
