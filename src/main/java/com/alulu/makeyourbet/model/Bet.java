package com.alulu.makeyourbet.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bet extends Identity {

	private User user;
	private Showdown showdown;
	private Integer result1;
	private Integer result2;
	private Game game;

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="user_fk")
	public User getUser() {
		return user;
	}

	public void setShowdown(Showdown showdown) {
		this.showdown = showdown;
	}

	@ManyToOne
	@JoinColumn(name="showdown_fk")
	public Showdown getShowdown() {
		return showdown;
	}

	public void setResult1(Integer result1) {
		this.result1 = result1;
	}

	public Integer getResult1() {
		return result1;
	}

	public void setResult2(Integer result2) {
		this.result2 = result2;
	}

	public Integer getResult2() {
		return result2;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	@ManyToOne
	@JoinColumn(name="game_fk")
	public Game getGame() {
		return game;
	}

}