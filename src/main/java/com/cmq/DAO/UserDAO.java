package com.cmq.DAO;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cmq.model.User;

@Transactional
public interface UserDAO {

	User getUser(Long id);
	List<User> getUserByName(String name);
	User getUserByEmailId(String emailId);
	
}
