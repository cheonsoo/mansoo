//package com.mansoo.service;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.mansoo.board.data.Account;
//import com.mansoo.board.service.AccountService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:context/applicationContext*.xml")
//public class AccountServiceTest {
//	
//	@Autowired
//	private AccountService accountService;
//	
//	@Test
//	public void getAccountTest() {
//		Account account = new Account();
//		account.setAccountKey(1);
//		account = accountService.getAccount(account);
//		System.out.println(account.getAccountId());
//	}
//
//}
