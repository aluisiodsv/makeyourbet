package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.Bet;

public interface BetRepository {

	public void create(Bet entity);

	public Bet update(Bet entity);

	public void destroy(Bet entity);

	public Bet find(Long id);

	public List<Bet> findAll();

}