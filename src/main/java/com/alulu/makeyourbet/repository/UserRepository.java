package com.alulu.makeyourbet.repository;

import java.util.List;

import com.alulu.makeyourbet.model.User;

public interface UserRepository {

	public void create(User entity);

	public User update(User entity);

	public void destroy(User entity);

	public User find(Long id);

	public List<User> findAll();

}