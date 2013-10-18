package com.alulu.makeyourbet.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Showdown extends Identity {

	private Team team1;
	private Team team2;

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	@ManyToOne
	@JoinColumn(name="team1_fk")
	public Team getTeam1() {
		return team1;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	@ManyToOne
	@JoinColumn(name="team2_fk")
	public Team getTeam2() {
		return team2;
	}

}