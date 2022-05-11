package com.controller;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.AppService;
	import com.model.Registration;
	import com.model.Login;
import java.util.List;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	@Autowired
	private AppService service;
	//@RequestMapping(value= "/welcome",method=RequestMethod.GET)
	@GetMapping("/loadusers")
	public List<Registration> sayHello() {
		List<Registration> lst=service.loadAll();
		return lst;
		
	}
	//@RequestMapping(value= "/login",method=RequestMethod.POST)
	//@PostMapping("/login")
	public String Login(@RequestBody Login login) {
		if(service.loginValid(login)) {
			return "Login Success";
		}
		return "Login Failure";
	}
	//@RequestMapping(value= "/registration",method=RequestMethod.POST)
	@PostMapping("/registration")
	public String Registration(@RequestBody Registration registration) {
		service.addUser(registration);
		return "user added";
	}
	@GetMapping("/finduser/{uname}")
	public String finduser(@PathVariable("uname")String name) {
		if(service.findUser(name)) {
			return name+" found";
		}
		return name+" not found";
	}
}
