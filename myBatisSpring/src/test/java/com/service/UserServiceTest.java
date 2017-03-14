package com.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.model.User;

import sun.rmi.server.UnicastServerRef;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class UserServiceTest {

	private static final Logger LOGGER = Logger.getLogger(UserServiceTest.class);
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void getUserById(){
		User user = userService.getUserById("1");
		LOGGER.info(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd "));
		
	}
	
	@Test
	public void getAll(){
		List<User> users = userService.getAll();
		LOGGER.info(JSON.toJSON(users));
	}
	
	
}
