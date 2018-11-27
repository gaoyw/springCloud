package com.dm.cloud.feign.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.cloud.feign.feignService.User;
import com.dm.cloud.feign.feignService.UserClient;

/**
 * 部门微服务
 * 
 * @ClassName: FeignDeptController
 * @author gaoy
 * @date 2018年11月19日 下午2:48:01
 */
@RestController
@RequestMapping("feignDept")
public class FeignDeptController {

	@Autowired
	private UserClient userClient;

	/**
	 * 没调用微服务
	 */
	@GetMapping("deptList")
	public String deptList(HttpServletRequest request) {
		System.err.println("finge-dept服务deptLisr方法被调用");
		return "成功调用finge服务deptLisr方法";
	}

	/**
	 * 调用user微服务
	 */
	@GetMapping("userList")
	public List<User> userList(HttpServletRequest request) {
		System.err.println("finge-dept服务userList方法被调用");
		try {
			List<User> users = userClient.getUsers();
			return users == null ? new ArrayList<User>() : users;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
