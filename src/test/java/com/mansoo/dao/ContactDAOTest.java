package com.mansoo.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.board.dao.ContactDAO;
import com.mansoo.board.data.Contact;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext*.xml")
@Transactional
public class ContactDAOTest {
	
	@Autowired
	
	private ContactDAO contactDAO;
	
	@Test
	public void test() {
		System.out.println("test");
		List<Contact> contactList = contactDAO.listContact();
		for (Contact contact : contactList) {
			System.out.println(contact.getId() + " : " + contact.getFirstname());
		}
	}

}
