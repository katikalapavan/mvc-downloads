package com.homeward.service;

import org.springframework.stereotype.Component;

@Component("green")
public class GreenColor implements Color {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Green Color";
	}

}
