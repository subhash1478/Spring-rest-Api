package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.User;
import java.util.Optional;

public interface UserService {

	public User addUser(User user) ;
	public List<User> getUser() ;
	public Optional<User> getUserById(Long Id) ;
	

}
