package com.mansoo.service;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.board.data.Users;
import com.mansoo.board.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class UserServiceTest {
	
	@Autowired
	private UsersService usersService;
	
	@Test
	public void getLoginTest() {
		
		Users users = usersService.getUsers("mansoo", "mansoo");
		
		Collection<GrantedAuthority> authorities = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails userDetails = new User(users.getUsername(), users.getPassword(), authorities);
		
		System.out.println("password : " + userDetails.getPassword());
	}
}
