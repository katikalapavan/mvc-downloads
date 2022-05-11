package com.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

//import javax.servlet.Registration;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {
	@Autowired
	
	RestTemplate restTemplate;
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public String callApp() {
		String response=restTemplate.exchange("http://emp-service/loademp",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}
	
	public String callAppwithPara(String location) {
		String response=restTemplate.exchange("http://emp-service/loademp/{location}",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {},location).getBody();
		return response;
	}
	
	
}
