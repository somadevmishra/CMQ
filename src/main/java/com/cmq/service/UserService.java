package com.cmq.service;

import java.util.List;

import com.cmq.model.User;

public interface UserService {

	User getUser(Long id);
	List<User> getUserByName(String name);
	User getUserByEmailId(String emailId);
	
}
