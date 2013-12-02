package com.mansoo.board.service;

import com.mansoo.board.data.Users;

public interface UsersService {
	public Users getUsers(String username);
	public Users getUsers(String username, String password);
}
