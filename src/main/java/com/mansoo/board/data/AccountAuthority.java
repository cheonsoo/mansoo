package com.mansoo.board.data;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ACCOUNT_AUTHORITY")
public class AccountAuthority implements java.io.Serializable {
	
//	@Table(name = "ACCOUNT")
	private Account account;
	
//	@Table(name = "ACCOUNT_AUTHORITY")
	private AccountAuthority accountAuthority;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public AccountAuthority getAccountAuthority() {
		return accountAuthority;
	}
	public void setAccountAuthority(AccountAuthority accountAuthority) {
		this.accountAuthority = accountAuthority;
	}
	
	
	
//    @Id
//    @Column(name = "ACCOUNT_KEY")
//    private int accountKey;
//    
//    @Id
//    @Column(name = "AUTHORITY_KEY")
//    private int authorityKey;
//
//	public int getAccountKey() {
//		return accountKey;
//	}
//	
//	public void setAccountKey(int accountKey) {
//		this.accountKey = accountKey;
//	}
//
//	public int getAuthorityKey() {
//		return authorityKey;
//	}
//
//	public void setAuthorityKey(int authorityKey) {
//		this.authorityKey = authorityKey;
//	}
}