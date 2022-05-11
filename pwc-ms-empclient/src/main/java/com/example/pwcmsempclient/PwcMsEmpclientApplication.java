package com.example.pwcmsempclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableEurekaClient
public class PwcMsEmpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwcMsEmpclientApplication.class, args);
	}

}
