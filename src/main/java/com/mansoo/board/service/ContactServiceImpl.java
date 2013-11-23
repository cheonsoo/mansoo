package com.mansoo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mansoo.board.dao.ContactDAO;
import com.mansoo.board.data.Contact;


@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    public List<Contact> listContact() {
        return contactDAO.listContact();
    }

    public void removeContact(int id) {
        contactDAO.removeContact(id);
    }
}
