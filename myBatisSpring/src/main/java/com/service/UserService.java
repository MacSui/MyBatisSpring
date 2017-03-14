package com.service;

import java.util.List;

import com.model.User;

public interface UserService {

	public User getUserById(String id) ;
	
	public List<User> getAll();
	
}
