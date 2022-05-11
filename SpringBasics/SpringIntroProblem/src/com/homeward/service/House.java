package com.homeward.service;

public class House {
	Door[] doors;
	House(Door[] doors)
	{
		this.doors=doors;
	}
	public void initMethod()
	{
		System.out.println("init method of house has been invoked");;
	}
	public void destroyMethod()
	{
		System.out.println("destroy method of house has been invoked");;
	}
	public void getString()
	{
		for(int i=0;i<doors.length;i++)
			System.out.println("The door no."+i+1+" is::"+doors[i].getColor());
	}
}
