package com.mansoo.board.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @Column(name = "ACCOUT_KEY")
    @GeneratedValue
    private int accountKey;

    @Column(name = "ACCOUNT_ID")
    private String accountId;
    
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    
    @Column(name = "PASSWORD")
    private String password;
}