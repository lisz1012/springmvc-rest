package com.lisz.controller;

import com.lisz.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	/**
	 * Controller中也支持原生Servlet的对象，需要在参数中给出
	 * HttpServletRequest
	 * HttpServletResponse
	 * HttpSession
	 * Locales:设置区域信息
	 * InputStream
	 * OutputStream
	 * Reader
	 * Writer
	 */
	@GetMapping(value = "/api")
	public String servletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		request.setAttribute("request", "REQUEST");
		session.setAttribute("session", "SESSION");
		return "success";
	}
}
