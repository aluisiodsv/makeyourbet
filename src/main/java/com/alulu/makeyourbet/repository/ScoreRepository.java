package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.Score;

public interface ScoreRepository {

	public void create(Score entity);

	public Score update(Score entity);

	public void destroy(Score entity);

	public Score find(Long id);

	public List<Score> findAll();

}