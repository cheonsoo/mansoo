package com.mansoo.board.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mansoo.board.data.Account;

public class AccountDAOImpl implements AccountDAO {
	
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
	public Account getAccount(String accountId, String password) {
		this.sessionFactory.getCurrentSession().createQuery("FROM Account").list();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAccountList() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Account").list();
	}
}
