package com.mansoo.user.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mansoo.board.data.Account;
import com.mansoo.board.service.AccountService;
import com.mansoo.board.service.UsersService;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UsersService usersService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Collection<GrantedAuthority> authorities = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority("ROLE_USER"));
//		UserDetails userDetails = new User(username, "admin", true, false, false, false, authorities);
		UserDetails userDetails = new User(username, "admin", authorities);
		System.out.println("password : " + userDetails.getPassword());
		
		return userDetails;
	}

}
