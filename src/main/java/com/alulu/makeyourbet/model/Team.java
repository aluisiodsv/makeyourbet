package com.alulu.makeyourbet.model;

import javax.persistence.Entity;

@Entity
public class Team extends Identity {

	private String name;
	private String logo;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

}