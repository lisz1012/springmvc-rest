package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {
	/*
	当发送请求的时候，找到对应的处理方法后，会根据参数的名称从request中获取对应的参数，冰封撞倒方法中
	此时要求，方法的名字和url中参数的名字相同，如果不一致就会设置不进去。如果前后端参数名不同，则需要通过
	@RequestParam来使用.
	    value: 获取的参数值
	    required：是否必须，默认true
	    defaultValue：没有这个参数就用默认值
	 */
	@RequestMapping("/testRequest")
	public String testRequest(@RequestParam(value = "username", required = false, defaultValue = "zhangsan") String name){
		System.out.println(name);
		return "success";
	}

	/*
	请求头
	参数同@RequestParam
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("User-Agent") String userAgent){
		System.out.println(userAgent);
		return "success";
	}

	/*
	获取Cookie的值
	request.getCookies（）;返回Cookie数组
	 */
	@RequestMapping("/testCookie")
	public String testCookie(@CookieValue("JSESSIONID") String jsId){
		System.out.println(jsId);
		return "success";
	}
}
