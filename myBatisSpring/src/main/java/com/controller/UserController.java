package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired   
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUserById(String id, HttpServletRequest request) {

		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "showUser";
	}

}
