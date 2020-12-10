package com.lisz.dao;

import com.lisz.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void save(User user) {
		System.out.println("save");
	}

	public void update(Integer id) {
		System.out.println("update " + id);
	}

	public void delete(Integer id) {
		System.out.println("delete " + id);
	}

	public void query() {
		System.out.println("query");
	}
}
