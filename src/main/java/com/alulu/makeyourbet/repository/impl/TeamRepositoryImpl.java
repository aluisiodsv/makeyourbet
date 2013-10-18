package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.Team;
import com.alulu.makeyourbet.repository.TeamRepository;

@Component
public class TeamRepositoryImpl extends AbstractRepositoryImpl<Team, Long> implements TeamRepository {

	public TeamRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}