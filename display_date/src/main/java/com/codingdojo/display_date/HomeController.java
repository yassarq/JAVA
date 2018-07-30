package com.codingdojo.display_date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("date", "time");
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datedash(Model model) {
		Date date = new java.util.Date();
		SimpleDateFormat  newFormat = new SimpleDateFormat("EEEEEE, d MMMM yyyy");
		String newDate = newFormat.format(date);
		model.addAttribute("date", "newDate");
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timedash(Model model) {
		Date time = new java.util.Date();
		SimpleDateFormat newFormat = new SimpleDateFormat("h:mm aa");
		String newTime = newFormat.format(time);
		model.addAttribute("time", "newTime");
		return "time.jsp";
	}

}
