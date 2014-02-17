package com.mansoo.user.dao;

import java.util.List;

import com.mansoo.user.data.Users;

public interface UserDAO {
	public Users getUser(String userId);
	public Users getUser(String userId, String password);
	public List<Users> getUserList();
	public Users addUser(Users users);
}
