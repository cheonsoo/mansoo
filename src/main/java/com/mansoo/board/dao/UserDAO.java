package com.mansoo.board.dao;

import java.util.List;

import com.mansoo.board.data.Users;

public interface UserDAO {
	public Users getUser(String userId, String password);
	public List<Users> getUserList();
}
