package com.alulu.makeyourbet.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

import com.alulu.makeyourbet.model.Team;
import com.alulu.makeyourbet.repository.TeamRepository;

@Resource
public class TeamController {

	private final Result result;
	private final TeamRepository repository;
	private final Validator validator;

	public TeamController(Result result, TeamRepository repository,
			Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}

	@Get("/teams")
	public List<Team> index() {
		return repository.findAll();
	}

	@Post("/teams")
	public void create(Team team) {
		validator.validate(team);
		validator.onErrorUsePageOf(this).newTeam();
		repository.create(team);
		result.redirectTo(this).index();
	}

	@Get("/teams/new")
	public Team newTeam() {
		return new Team();
	}

	@Put("/teams")
	public void update(Team team) {
		validator.validate(team);
		validator.onErrorUsePageOf(this).edit(team);
		repository.update(team);
		result.redirectTo(this).index();
	}

	@Get("/teams/{team.id}/edit")
	public Team edit(Team team) {
		return repository.find(team.getId());
	}

	@Get("/teams/{team.id}")
	public Team show(Team team) {
		return repository.find(team.getId());
	}

	@Delete("/teams/{team.id}")
	public void destroy(Team team) {
		repository.destroy(repository.find(team.getId()));
		result.redirectTo(this).index();
	}

}