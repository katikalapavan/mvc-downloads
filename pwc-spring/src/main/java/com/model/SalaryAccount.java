package com.model;

public class SalaryAccount implements InterestCalculator  {
private int duration;
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
public SalaryAccount() {
	System.out.println("Salary initialized");
}
}
