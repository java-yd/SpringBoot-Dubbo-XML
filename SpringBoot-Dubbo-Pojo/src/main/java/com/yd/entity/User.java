package com.yd.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 实体类，对应mysql
 * @author yuand
 *
 */
@Data
public class User implements Serializable{

	private   Integer  id;
	
	private   String  username;
	
	private   String  password;
	
	private   Integer  make;
	
}
