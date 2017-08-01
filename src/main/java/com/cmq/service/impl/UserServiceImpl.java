package com.cmq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmq.DAO.UserDAO;
import com.cmq.model.User;

@Service(value="userService")
public class UserServiceImpl implements com.cmq.service.UserService {

	@Autowired
	private UserDAO userDAO;
	
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}

	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDAO.getUserByName(name);
	}

	public User getUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return userDAO.getUserByEmailId(emailId);
	}

}
