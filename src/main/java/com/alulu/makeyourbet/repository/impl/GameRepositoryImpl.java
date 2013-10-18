package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.Game;
import com.alulu.makeyourbet.repository.GameRepository;

@Component
public class GameRepositoryImpl extends AbstractRepositoryImpl<Game, Long> implements GameRepository {

	public GameRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}