package com.codingdojo.familiar_routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for: nothing";
		} else {
			return "You searched for: " + searchQuery;
		}
	}
	
	@RequestMapping("/coding")
	public String hello_world() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
}
