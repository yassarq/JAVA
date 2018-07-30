package com.codingdojo.stringproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@RequestMapping("/")
	public String hello_client() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String spring_boot() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
