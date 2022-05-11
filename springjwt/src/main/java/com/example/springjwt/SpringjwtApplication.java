package com.example.springjwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.User;
import com.repository.UserRepository;

//import antlr.collections.List;
@SpringBootApplication
public class SpringjwtApplication {
@Autowired
	private UserRepository repository;

@PostConstruct
		public void initUsers() {
			List<User> users=Stream.of(
					new User(id:101,userName:"pavan",password:"password",email:"king")
					).collect(Collectors.toList());
					repository.saveAll(users);
		}
		public static void main(String[] args) {
		SpringApplication.run(SpringjwtApplication.class, args);
	}

}
