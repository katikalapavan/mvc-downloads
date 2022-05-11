package com.homeward.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.homeward.model.Alarm;
@Component("door")
public class Door {
	private Color color; 
	
	
	Door(Color color)
	{
		this.color=color;
	}
	@Autowired
	@Qualifier("audio")
private Alarm alarm;
public void setAlarm(Alarm alarm)
{
	this.alarm=alarm;
}
public void initMethod()
{
	System.out.println("init method of Door has been invoked");;
}
public void destroyMethod()
{
	System.out.println("destroy method of Door has been invoked");;
}
public String getColor()
{
	return color.getColor();
}
public Alarm getAlarm()
{
	return alarm;
}
public void activate()
{
	alarm.activate();
}
public void deactivate()
{
	alarm.deactivate();
}
}
