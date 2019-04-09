package com._520it.service.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com._520it.mapper.UsersMapper;
import com._520it.pojo.Users;
import com._520it.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}

}
