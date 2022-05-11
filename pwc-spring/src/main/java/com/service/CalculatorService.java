package com.service;
import com.model.InterestCalculator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Service("service")
public class CalculatorService {
	@Autowired
	@Qualifier("fda")
private InterestCalculator ic;

public InterestCalculator getIc() {
	return ic;
}

public void setIc(InterestCalculator ic) {
	this.ic = ic;
}
public double service(double amount) {
	return ic.calculate(amount);
}
public CalculatorService() {
	System.out.println("Service initialized");
}
@PostConstruct
public void callInit() {
	System.out.println("init initialized");
}
@PreDestroy
public void callDestroy() {
	System.out.println("Destroy Called");
}
}
