package com.cmq.testInit;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cmq.DAO.UserDAO;
import com.cmq.DAO.impl.UserDAOImpl;
import com.cmq.service.UserService;
import com.cmq.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:pathTo/WEB-INF/dispatcher-servlet.xml")
@Configuration
public class TestCMQConfiguration {

	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
	
	@Bean
	public UserDAO userDAO(){
		return new UserDAOImpl();
	}
}
