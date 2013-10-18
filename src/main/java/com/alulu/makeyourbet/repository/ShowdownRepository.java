package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.Showdown;

public interface ShowdownRepository {

	public void create(Showdown entity);

	public Showdown update(Showdown entity);

	public void destroy(Showdown entity);

	public Showdown find(Long id);

	public List<Showdown> findAll();

}