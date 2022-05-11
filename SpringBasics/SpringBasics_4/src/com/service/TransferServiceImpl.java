package com.service;

import com.dao.AccountDao;
import com.entity.Account;


public class TransferServiceImpl implements TransferService {

	private AccountDao accountDao;

	/*public TransferServiceImpl() {
	}*/

	public TransferServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	/*public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
*/
	
	@Override
	public void transferFunds(String fromAccount, String destAccount,
			double amount) {
		Account srcAcct = accountDao.getAccount(fromAccount);
		Account destAcct = accountDao.getAccount(destAccount);

		srcAcct.debit(amount);
		destAcct.credit(amount);

		accountDao.updateAccount(srcAcct);
		accountDao.updateAccount(destAcct);

	}

}
