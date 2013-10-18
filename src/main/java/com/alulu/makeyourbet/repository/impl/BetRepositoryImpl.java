package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.Bet;
import com.alulu.makeyourbet.repository.BetRepository;

@Component
public class BetRepositoryImpl extends AbstractRepositoryImpl<Bet, Long> implements BetRepository {

	public BetRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}