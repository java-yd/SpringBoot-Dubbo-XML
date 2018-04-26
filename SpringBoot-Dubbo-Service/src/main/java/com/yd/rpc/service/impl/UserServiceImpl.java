package com.yd.rpc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.yd.entity.User;
import com.yd.mapper.UserMapper;
import com.yd.rpc.service.UserService;

@Transactional
public class UserServiceImpl implements  UserService{

	@Autowired
	private   UserMapper   userMapper;
	
	@Override
	public User findUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public long saveUser(User user) {
		userMapper.insert(user);
//		int  i = 0/0;   测试事物，dubbo的xml配置事物是有作用的，注解方式不行
		return 1;
	}

}
