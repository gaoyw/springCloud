package com.dm.cloud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.cloud.feignService.User;
import com.dm.cloud.feignService.DeptClient;

@RestController
@RequestMapping("feignUser")
public class FeignUserController {

	@Autowired
	private DeptClient deptClient;

	@GetMapping("getUser/{id}")
	public User getUser(@PathVariable String id) {
		System.err.println("finge-user-B服务getUser方法被调用");
		User user = new User();
		user.setName("小王");
		user.setAge("25");
		return user;
	}

	@GetMapping("userList")
	public List<User> userList(HttpServletRequest request) {
		System.err.println("finge-user-B服务userList方法被调用");
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setName("小强");
		user.setAge("22");
		User user2 = new User();
		user2.setName("小高");
		user2.setAge("23");
		users.add(user);
		users.add(user2);
		return users;
	}

	@GetMapping("deptList")
	public String deptList(HttpServletRequest request) {
		System.err.println("finge-user-B服务deptLisr方法被调用");
		String dept = deptClient.deptList();
		return dept;
	}
}
