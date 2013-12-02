package com.mansoo.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
	}
	
	@Test
	public void getAccount() {
		Account account = new Account();
		account.setAccountKey(1);
		account = accountDAO.getAccount(account);
		System.out.println(account.getAccountId());
	}
	
//	@Test
//	public void getAccountByLoginId() {
//		Account account = new Account();
//		account.setAccountKey(1);
//		account = accountService.getAccount(account);
////		account = accountDAO.getAccount(account);
//		System.out.println(account.getAccountId());
//	}
	
//	@Test
	public void getUserDetails() {
//		Account account = new Account();
//		account.setAccountKey(1);
//		UserDetails userDetails = userService.loadUserByUsername("admin");
//		System.out.println(userDetails.getAuthorities());
	}
	
//	@Test
	public void getAccountAuthority() {
//		AccountAuthority aa = new AccountAuthority();
//		accountDAO.getAccount("");
	}
}
