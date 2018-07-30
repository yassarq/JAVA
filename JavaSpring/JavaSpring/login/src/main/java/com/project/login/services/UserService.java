package com.project.login.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.login.models.User;
import com.project.login.repositories.UserRepository;

@Service
public class UserService{
	@Autowired
	private UserRepository userRepository;

	public UserService(UserRepository userRepository){ //not even sure if we need this because of the autowire?
		this.userRepository = userRepository;
	}

	public User register(User user){ //this register a user 
		User emailExists = (User) findByEmail(user.getEmail()); // creating a function

		if(emailExists != null){
			return null;
		}else{
			user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
			return userRepository.save(user);
		}
	}

	public User login(String email,String password){
		User emailExists = (User) findByEmail(email); //creating a function
		
		if(emailExists != null) {
			if(BCrypt.checkpw(password, emailExists.getPassword() )){
				return emailExists;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	public User findByEmail(String email){
		return userRepository.findByEmail(email);
	}
	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}
	public User findById(Long id){
		return userRepository.findOne(id);
	}
}