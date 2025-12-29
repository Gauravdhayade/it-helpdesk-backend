package com.helpdesk.it.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.helpdesk.it.backend.model.User;
import com.helpdesk.it.backend.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	UserRepository userRepo;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		user.setRole("USER");
		return userRepo.save(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		User u = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
		return (u != null) ? "Login Successful" : "Invalid Credentials";
	}
}
