package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.Showdown;
import com.alulu.makeyourbet.repository.ShowdownRepository;

@Component
public class ShowdownRepositoryImpl extends AbstractRepositoryImpl<Showdown, Long> implements ShowdownRepository {

	public ShowdownRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}