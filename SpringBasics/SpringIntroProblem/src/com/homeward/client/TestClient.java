package com.homeward.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.homeward.service.Door;
import com.homeward.service.House;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:Beans.xml");
		Door door=ctx.getBean("greenDoorBean",Door.class);
		door.activate();
		door.deactivate();
		System.out.println(door.getColor());
		//House house=ctx.getBean("houseBean",House.class);
		//house.getString();
	}

}
