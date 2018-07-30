package com.project.login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.login.models.User;
import com.project.login.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/") // root route 
	public String dashboard(HttpSession session,Model model){ // injecting session and using the Model
		if(session.getAttribute("id") != null) { // if there a session ID
			User user = userService.findById((Long)session.getAttribute("id")); // compare it so see if there is a user by that ID 
			if(user != null) { // if there is a user
				model.addAttribute("user",user); // add it to our models 
				return "dashboard"; // render the dashboard with the dashboard 
			}else {
				return "redirect:/register"; // if it equals null from ln 28 force login. 
			}			
		}else{
			return "redirect:/register"; //if it is null from ln 26 then force login 
		}
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("user") User user,HttpSession session){ // inject session for us to use as well as tying it to the user model 
		session.invalidate();
		return "register";
	}
	
	@PostMapping("/register") //post mapping of register 
	public String create(@Valid @ModelAttribute("user") User user, BindingResult res, RedirectAttributes flash, HttpSession session){ // injecting user model, validator, having the binding results to the model and session. 
		if(res.hasErrors()) { // if ther are errors from the validator 
			flash.addFlashAttribute("errors",res.getAllErrors()); // add it to a list of errors and flash them // the flash attributes lets us redirect and keep the messages for one reload. 
			return "redirect:/register";
		}
		
		User registerer = userService.register(user); // we are creating a userService  register function instance for us to use. 
		
		if(registerer != null){ // if the function returns a user 
			session.setAttribute("id",registerer.getId()); // get the users id and set it in session 
			return "redirect:/"; // redirect to root, dashboard
		}else {
			flash.addFlashAttribute("registerError","A user with this email already exists.");
			return "redirect:/register"; // if the fuction returns null then redirect
		}
	}
	
	@PostMapping("/login")
	public String login( @RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes flash){ // we are using flash to redirect. 
		User user = userService.login(email, password); // using the login function from the UserSerive
		
		if(user == null) { // null means we didn't find a user 
			flash.addFlashAttribute("registerError","Invalid Credentials");
			return "redirect:/register";
		}else {
			session.setAttribute("id",user.getId()); // if we find a user set their id to session
			return "redirect:/"; // root or Dashboard
		}
	}
}
