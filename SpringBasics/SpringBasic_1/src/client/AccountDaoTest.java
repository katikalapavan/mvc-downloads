/**
 * 
 */
package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	 System.out.println(rahulAcc.getAccountNumber() 
			 		+"," + rahulAcc.getAccountOwner() 
			 		+"," + rahulAcc.getBalance());
	}

}
