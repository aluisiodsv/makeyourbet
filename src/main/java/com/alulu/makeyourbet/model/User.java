package com.alulu.makeyourbet.model;

import javax.persistence.Entity;

@Entity
public class User extends Identity {

	private String name;
	private boolean admin;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isAdmin() {
		return admin;
	}

}