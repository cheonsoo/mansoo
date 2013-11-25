package com.mansoo.board.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mansoo.board.data.User;

public class UserDAOImpl implements UserDAO {
	
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
	public User getUser(String UserId, String password) {
		this.sessionFactory.getCurrentSession().createQuery("FROM USER").list();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM USER").list();
	}
}
