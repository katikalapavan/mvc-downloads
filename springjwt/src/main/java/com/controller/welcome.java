package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	@GetMapping("/")
public String welcome1() {
	return "welcome to pavan";
}

}
