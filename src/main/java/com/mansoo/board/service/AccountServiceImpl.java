package com.mansoo.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.board.dao.AccountDAO;
import com.mansoo.board.data.Account;


@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    public Account getAccount(Account account) {
        return accountDAO.getAccount(account);
    }
}
