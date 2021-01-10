package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entities.User;

@Service
public class UserServicesImpl implements UserService {
	@Autowired
	public UserDao userDoa;

	public UserServicesImpl() {
	}

	@Override
	public List<User> getUser() {
		return userDoa.findAll();
	}

	@Override
	public Optional<User> getUserById(Long Id) {
		System.out.println(Id);
		Optional<User> u = userDoa.findById(Id);
		System.out.println(u);
		return u;
	}

	public User addUser(User user) {
		userDoa.save(user);
		return user;

	}
}
