package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.Score;
import com.alulu.makeyourbet.repository.ScoreRepository;

@Component
public class ScoreRepositoryImpl extends AbstractRepositoryImpl<Score, Long> implements ScoreRepository {

	public ScoreRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}