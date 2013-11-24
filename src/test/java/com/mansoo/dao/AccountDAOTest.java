package com.mansoo.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

import com.mansoo.board.dao.AccountDAO;
import com.mansoo.board.data.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class AccountDAOTest {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@Test
	public void getAccountListTest() {
		List<Account> accountList = accountDAO.getAccountList();
		for (Account account : accountList) {
			System.out.println(account.getAccountKey() + " : " + account.getAccountId());
		}
		
		
		
		
		Collection<GrantedAuthority> authorities = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails userDetails = new User("mansoo", "mansoo", true, false, false, false, authorities);
		
		System.out.println(userDetails.getUsername());
		System.out.println(userDetails.getPassword());
		System.out.println(userDetails.getAuthorities());
		
	}

}
