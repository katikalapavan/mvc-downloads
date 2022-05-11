
package client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AccountDao;
import com.entity.Account;
 
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
			  context.getBean("accountDao", AccountDao.class);
	  accountDao.createAccount(rahulAcc);
	  accountDao.createAccount(deepaAcc);
	  
	  List<Account> accounts = accountDao.getAllAccounts();
	  for(Account account : accounts) {
		  System.out.println(account);
	  }
	}

}
