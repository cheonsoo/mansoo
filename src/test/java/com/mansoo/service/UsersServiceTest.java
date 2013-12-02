package com.mansoo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.board.data.Account;
import com.mansoo.board.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class UsersServiceTest {
	
	@Autowired
	private UsersService usersService;
	
	@Test
	public void getAccountTest() {
		usersService.getUsers("mansoo", "mansoo");
	}
}
