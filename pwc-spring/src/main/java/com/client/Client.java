package com.client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.CalculatorService;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CalculatorService cs=(CalculatorService) ctx.getBean("service");
System.out.println(cs.service(2345));
//CalculatorService cs2=(CalculatorService) ctx.getBean("service");
//System.out.println(cs2.hashCode());
ctx.close();
	}

}
