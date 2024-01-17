package com.app.service;

import java.util.List;

import com.app.entity.User;

public interface IUserService {

	Long saveUser(User user);

	List<User> getUser();
	
	public User findByUsername(String username);

}
