package com.codingdojo.testme;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery) {
	if(searchQuery == null) {
		return "Hello Human! Welcome to SpringBoot!";
	} 
	else {
		return "Hello " + searchQuery + "! Welcome to SpringBoot!";
	}
	}
}