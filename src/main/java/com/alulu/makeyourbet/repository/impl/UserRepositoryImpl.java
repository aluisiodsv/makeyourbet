package com.alulu.makeyourbet.repository.impl;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.alulu.makeyourbet.model.User;
import com.alulu.makeyourbet.repository.UserRepository;

@Component
public class UserRepositoryImpl extends AbstractRepositoryImpl<User, Long> implements UserRepository {

	public UserRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}

}