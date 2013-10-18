package com.alulu.makeyourbet.model;

import javax.persistence.Entity;

@Entity
public class Game extends Identity {

	private Integer number;
	private boolean current;

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	public boolean isCurrent() {
		return current;
	}

}