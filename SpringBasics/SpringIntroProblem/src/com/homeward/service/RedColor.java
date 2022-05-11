package com.homeward.service;

import org.springframework.stereotype.Component;

@Component("red")
public class RedColor implements Color {
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "red Color";
	}

}
