package com.mansoo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansoo.user.dao.UserDAO;
import com.mansoo.user.data.Users;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Users getUsers(String username) {
		return userDAO.getUser(username);
	}
	
	@Override
	public Users getUsers(String username, String password) {
		return userDAO.getUser(username, password);
	}

	@Override
	public Users addUser(Users users) {
		return userDAO.addUser(users);
	}

}
