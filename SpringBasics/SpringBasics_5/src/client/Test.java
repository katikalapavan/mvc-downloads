/**
 * 
 */
package client;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	 Class.forName("com.mysql.jdbc.Driver");
	  ApplicationContext context  = 
			  	new ClassPathXmlApplicationContext("beans.xml");
	
	  First first = context.getBean("first", First.class);
	 first.test();
	}

}
