package com.mansoo.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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

import com.mansoo.user.data.UserRoles;
import com.mansoo.user.data.Users;
import com.mansoo.user.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class LoginServiceTest {
	
	@Autowired
	private UsersService usersService;
	
	@Test
	public void getUsersTest() {
		Users users = usersService.getUsers("user");
		System.out.println(users.getUsername());
		System.out.println("size : " + users.getUserRoles().size());
		
		Iterator<UserRoles> iter = users.getUserRoles().iterator();
		String rolesStr = "";
		while (iter.hasNext()) {
			UserRoles roles = iter.next();
			System.out.println(roles.getUserkey() + " : " + roles.getAuthority());
			rolesStr += roles.getAuthority() + ",";
		}
		
//		System.out.println(users.getUserRoles().toArray().toString());
		System.out.println(rolesStr);
		
		System.out.println(rolesStr.substring(0, rolesStr.length()-1));
	}
	
//	@Test
	public void getLoginTest() {
		
		Users users = usersService.getUsers("mansoo", "mansoo");
		
		Collection<GrantedAuthority> authorities = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails userDetails = new User(users.getUsername(), users.getPassword(), authorities);
		
		System.out.println("password : " + userDetails.getPassword());
	}
}
