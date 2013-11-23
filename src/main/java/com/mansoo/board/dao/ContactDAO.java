package com.mansoo.board.dao;

import java.util.List;

import com.mansoo.board.data.Contact;


public interface ContactDAO {
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(int id);
}
