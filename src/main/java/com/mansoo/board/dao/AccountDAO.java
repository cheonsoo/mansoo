package com.mansoo.board.dao;

import com.mansoo.board.data.Account;

public interface AccountDAO {
	public Account getAccount(String accountId, String password);
}
