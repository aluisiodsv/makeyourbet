package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.Game;

public interface GameRepository {

	public void create(Game entity);

	public Game update(Game entity);

	public void destroy(Game entity);

	public Game find(Long id);

	public List<Game> findAll();

}