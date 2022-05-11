package com.homeward.model;
import org.springframework.stereotype.Component;
@Component("audio")
public class AudioAlarm implements Alarm {

	
	@Override
	public void activate() {
		System.out.println("Audio alarm has been activated");// TODO Auto-generated method stub

	}
	public void initMethod()
	{
		System.out.println("init method of audioAlarm has been invoked");;
	}
	public void destroyMethod()
	{
		System.out.println("destroy method of audioAlarm has been invoked");;
	}
	

	@Override
	public void deactivate() {
		System.out.println("Audio alarm has been deactivated");// TODO Auto-generated method stub
	}

}
