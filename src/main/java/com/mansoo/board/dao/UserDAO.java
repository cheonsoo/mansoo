package com.mansoo.board.dao;

import java.util.List;

import com.mansoo.board.data.User;

public interface UserDAO {
	public User getUser(String userId, String password);
	public List<User> getUserList();
}
