package com.homeward.model;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.*;
@Component("visual")
@Lazy
public class VisualAlarm implements Alarm {

	
	@Override
	public void activate() {
		System.out.println("Visual Alarm Has been Activated");// TODO Auto-generated method stub

	}
	public void initMethod()
	{
		System.out.println("init method of visualAlarm has been invoked");;
	}
	public void destroyMethod()
	{
		System.out.println("destroy method of visualAlarm has been invoked");;
	}
	
	@Override
	public void deactivate() {
		System.out.println("Visual Alarm Has been Deactivated");
		// TODO Auto-generated method stub

	}

}
