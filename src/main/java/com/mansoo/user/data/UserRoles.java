package com.mansoo.user.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER_ROLES")
public class UserRoles {

    @Column(name = "USERKEY")
    private int userkey;
	
    @Column(name = "AUTHORITY")
    private String authority;
    
//    private Users users;

	public int getUserkey() {
		return userkey;
	}

	public void setUserkey(int userkey) {
		this.userkey = userkey;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}
    
}