/**
 * 
 */
package com.service;


public interface TransferService {
	
	/**
	 * @param fromAccount
	 * @param destAccount
	 * @param amount
	 */
	void transferFunds(String fromAccount, String destAccount, double amount);

}
