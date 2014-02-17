package com.mansoo.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.user.dao.UserDAO;
import com.mansoo.user.data.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class UserDAOTest {
	
	@Autowired
	private UserDAO userDAO;
	
	//@Test
	public void getUserListTest() {
		List<Users> userList = userDAO.getUserList();
		
		for (Users users : userList) {
			System.out.println(users.getUsername());
		}
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void getUserTest() {
		Users users = userDAO.getUser("admin", "admin");
		System.out.println(users.getUsername());
	}
}
