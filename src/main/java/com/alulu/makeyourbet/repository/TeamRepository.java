package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.Team;

public interface TeamRepository {

	public void create(Team entity);

	public Team update(Team entity);

	public void destroy(Team entity);

	public Team find(Long id);

	public List<Team> findAll();

}