package com.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sa")
public class SavingAccount implements InterestCalculator  {
	@Value("6")
private int duration;
	@Value("5.6")
private double roi;
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public double getRoi() {
	return roi;
}
public void setRoi(double roi) {
	this.roi = roi;
}
@Override
public double calculate(double amount) {
	return amount * roi/duration;
}
public SavingAccount() {
	System.out.println("SA initialized");
}
}
