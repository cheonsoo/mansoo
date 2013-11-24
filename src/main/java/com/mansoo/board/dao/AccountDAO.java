package com.mansoo.board.dao;

import java.util.List;

import com.mansoo.board.data.Account;

public interface AccountDAO {
	public Account getAccount(String accountId, String password);
	public List<Account> getAccountList();
}
