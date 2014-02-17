package com.mansoo.user.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mansoo.user.data.UserRoles;
import com.mansoo.user.data.Users;
import com.mansoo.user.service.UsersService;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private UsersService usersService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		UserDetails userDetails = new User(username, "admin", true, false, false, false, authorities);
		
		Users users = usersService.getUsers(username);
		
//		GrantedAuthority[] grantedAuthorities = {new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER")};
		
		GrantedAuthority[] grantedAuthorities = new SimpleGrantedAuthority[10];
		int idx = 0;
		Iterator<UserRoles> iter = users.getUserRoles().iterator();
		String rolesStr = "";
		while (iter.hasNext()) {
			UserRoles role = iter.next();
			grantedAuthorities[idx] = new SimpleGrantedAuthority(role.getAuthority());
			rolesStr += role.getAuthority() + ",";
			idx++;
		}
		Collection<GrantedAuthority> authorities = Arrays.asList(grantedAuthorities);
		Collection<GrantedAuthority> authorities2 = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority("ROLE_USER"));
		
		rolesStr = rolesStr.substring(0, rolesStr.length()-1);
		
		UserDetails userDetails = new User(users.getUsername(), users.getPassword(), AuthorityUtils.createAuthorityList(rolesStr));
		
		System.out.println("password : " + userDetails.getPassword());
		
		return userDetails;
	}

}
