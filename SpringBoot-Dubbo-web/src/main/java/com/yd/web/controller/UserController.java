package com.yd.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yd.entity.User;
import com.yd.rest.ResultData;
import com.yd.rpc.service.UserService;

/**
 * 
 * @author yuand
 *
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private   UserService   userService;
	
	/**
	 * 根据用户id，得到用户信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="user/{id}",method=RequestMethod.GET)
	public   ResultData   queryUserById(@PathVariable Integer  id){
		return   ResultData.one(userService.findUserById(id));
	}
	
	/**
	 * 新增用户
	 * @return
	 */
	@RequestMapping(value="user",method=RequestMethod.POST)
	public  ResultData   user(User  user){
		userService.saveUser(user);
		return   ResultData.ok();
	}
}
