package com.cmq.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cmq.model.User;
import com.cmq.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"/test-config.xml"})
@WebAppConfiguration(value="/test-config.xml")
public class TestUserService {

	@Autowired
	UserService uesrService;
	
	@Test
	public void testGetUser() {
		User user=uesrService.getUser(1L);
		Assert.assertNotNull(user);
	}

	@Test
	public void testGetUserByName() {
		User user=uesrService.getUserByName("somadev").get(0);
		Assert.assertNotNull(user);
	}

	@Test
	public void testGetUserByEmailId() {
		User user=uesrService.getUserByEmailId("somadev.mishra@gmail.com");
		Assert.assertNotNull(user);
	}

}
