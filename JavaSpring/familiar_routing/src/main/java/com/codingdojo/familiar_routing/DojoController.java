package com.codingdojo.familiar_routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String awesome() {
		return "The dojo is awesome!";
	}
	@RequestMapping("/burbank-dojo")
	public String location1() {
		return "Burbank Dojo is located in Southern California";
	}
	@RequestMapping("/san-jose")
	public String location2() {
		return "SJ dojo is the headquarters";
	}
}