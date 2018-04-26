package com.yd.rpc.service;

import com.yd.entity.User;

public interface UserService {

	/**
	 * 根据id，得到用户信息
	 * @param id
	 * @return
	 */
	User    findUserById(Integer  id);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	long    saveUser(User  user);
}
