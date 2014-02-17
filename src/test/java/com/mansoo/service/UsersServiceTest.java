package com.mansoo.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.user.data.UserRoles;
import com.mansoo.user.data.Users;
import com.mansoo.user.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class UsersServiceTest {
	
	@Autowired
	private UsersService usersService;
	
	@Test
	public void getUsersTest() {
		Users users = usersService.getUsers("user");
		Set<UserRoles> userRoles = users.getUserRoles();
		Iterator<UserRoles> iter = userRoles.iterator();
		
		System.out.println(users.getUsername());
		while (iter.hasNext()) {
			System.out.println(iter.next().getAuthority());
		}
	}
	
	@Test
	public void getUserRolesTest() {
//		UserRoles userRoles = userService.getUserRoles();
	}
	
//	@Test
	public void addUserTest() {
		
		Users users = new Users();
		users.setEnabled(true);
		users.setPassword("test1");
		users.setUsername("test1");
		
		UserRoles userRoles = new UserRoles();
		userRoles.setUserkey(5);
		userRoles.setAuthority("ROLE_USER");
//		userRoles.setUsers(users);
		Set<UserRoles> set = new HashSet<UserRoles>();
		set.add(userRoles);
		
		users.setUserRoles(set);
		
		usersService.addUser(users);
	}
}
