package com.mansoo.user.service;

import com.mansoo.user.data.Users;

public interface UsersService {
	public Users getUsers(String username);
	public Users getUsers(String username, String password);
	public Users addUser(Users users);
}
