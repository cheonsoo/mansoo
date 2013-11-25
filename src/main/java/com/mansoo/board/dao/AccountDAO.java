package com.mansoo.board.dao;

import java.util.List;

import com.mansoo.board.data.Account;

public interface AccountDAO {
	public Account getAccount(String accountId, String password);
	public Account getAccount(Account account);
	public List<Account> getAccountList();
	public Account getAccount(String accountId);
}
