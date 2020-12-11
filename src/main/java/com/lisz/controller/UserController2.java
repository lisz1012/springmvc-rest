package com.lisz.controller;

import com.lisz.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController2 {
	@RequestMapping(value = "/testUser", method = RequestMethod.POST)
	public String testUser(User user){
		System.out.println(user);
		return "success";
	}

	@GetMapping(value = "/testUserShowForm")
	public String testUserShowForm(){
		return "user";
	}
}
