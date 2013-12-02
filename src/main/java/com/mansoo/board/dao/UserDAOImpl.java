package com.mansoo.board.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mansoo.board.data.Users;

public class UserDAOImpl implements UserDAO {
	
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
	public Users getUser(String userId) {
    	List<Users> userList = this.sessionFactory.getCurrentSession().createQuery("FROM Users u where u.username='" + userId + "'").list();
    	Users users = null;
    	if (userList.size() > 0) {
    		users = userList.get(0);
    	}
		return users;
	}
    
    @Override
	public Users getUser(String userId, String password) {
    	List<Users> userList = this.sessionFactory.getCurrentSession().createQuery("FROM Users u where u.username='" + userId + "' and u.password='" + password + "'").list();
    	Users users = null;
    	if (userList.size() > 0) {
    		users = userList.get(0);
    	}
		return users;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getUserList() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Users").list();
	}
}
