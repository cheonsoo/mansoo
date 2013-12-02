package com.mansoo.board.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.mansoo.board.data.Contact;


@Repository
public class ContactDAOImpl implements ContactDAO {
	
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addContact(Contact contact) {
    	contact.setCreated(new Date());
        this.sessionFactory.getCurrentSession().save(contact);
    }
    
    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        System.out.println("SessionFactory is " + this.sessionFactory);
        return this.sessionFactory.getCurrentSession().createQuery("FROM Contact").list();
    }

    public void removeContact(int id) {
    	Contact contact = (Contact) this.sessionFactory.getCurrentSession().get(Contact.class, id);
        if (null != contact) {
        	this.sessionFactory.getCurrentSession().delete(contact);
        	this.sessionFactory.getCurrentSession().flush();
        }
    }
}
