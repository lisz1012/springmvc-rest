package com.lisz.controller;

import com.lisz.bean.User;
import com.lisz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * localhost:8080/PROJECT/save
 * localhost:8080/PROJECT/update?id=1
 * localhost:8080/PROJECT/delete?id=1
 * localhost:8080/PROJECT/query
 *
 * 发送请求的时候有不同的请求方式，能不能通过请求方式做一次转换？
 * POST：创建  /user
 * GET：获取   /user/1
 * PUT：更新   /user/1
 * DELETE：删除 /user/1
 *
 * 有请求方式Method来决定到底要做什么事
 */
@Controller
public class UserController {
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String save() {
		System.out.println(UserController.class.getName() + " save");
		userDao.save(new User());
		return "success";
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public String update(Integer id) {
		System.out.println(UserController.class.getName() + " update");
		userDao.update(id);
		return "success";
	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public String delete(Integer id) {
		System.out.println(UserController.class.getName() + " delete");
		userDao.delete(id);
		return "success";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String query() {
		System.out.println(UserController.class.getName() + " query");
		userDao.query();
		return "success";
	}
}
