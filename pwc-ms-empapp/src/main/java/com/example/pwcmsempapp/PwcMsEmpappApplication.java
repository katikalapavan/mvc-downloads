package com.example.pwcmsempapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com")
@EnableEurekaClient
public class PwcMsEmpappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwcMsEmpappApplication.class, args);
	}

}
