package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserService;

@RestController
public class UserController {
	@Autowired
	public UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
		return this.userService.getUser();
	}

	@GetMapping("/user/{Id}")
	public Optional<User> getUserById(@PathVariable String Id) {
		return this.userService.getUserById(Long.parseLong(Id));
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		System.out.println(user);
		return this.userService.addUser(user);
	}
}
