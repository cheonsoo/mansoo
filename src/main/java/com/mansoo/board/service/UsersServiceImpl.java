package com.mansoo.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mansoo.board.dao.UserDAO;
import com.mansoo.board.data.Users;

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

}
