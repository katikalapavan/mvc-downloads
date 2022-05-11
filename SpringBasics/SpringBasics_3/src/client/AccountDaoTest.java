/**
 * 
 */
package client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AccountDao;
import com.entity.Account;
import com.service.TransferService;

public class AccountDaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  ApplicationContext context  = 
			  	new ClassPathXmlApplicationContext("beans.xml");
	  
	  Account rahulAcc = 
			  context.getBean("rahulAccount", Account.class);
	  Account deepaAcc = 
			  context.getBean("deepaAccount", Account.class);
	  
	  AccountDao accountDao = 
			  context.getBean("accountDaoFactory", AccountDao.class);
	  
	  
	  accountDao.createAccount(rahulAcc);
	  accountDao.createAccount(deepaAcc);
	  
	/*  TransferService transferService  = 
			  context.getBean("transferService", TransferService.class);
	  transferService.transferFunds("SB500", "SB922", 500.00);*/
	
	  List<Account> accounts = accountDao.getAllAccounts();
	  for(Account account : accounts) {
		  System.out.println(account);
	  }
	}

}
