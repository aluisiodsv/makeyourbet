package com.alulu.makeyourbet.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

import com.alulu.makeyourbet.model.Showdown;
import com.alulu.makeyourbet.repository.ShowdownRepository;
import com.alulu.makeyourbet.repository.TeamRepository;

@Resource
public class ShowdownController {

	private final Result result;
	private final ShowdownRepository repository;
	private final TeamRepository teamRepository;
	private final Validator validator;

	public ShowdownController(Result result, ShowdownRepository repository,
			TeamRepository team1Repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.teamRepository = team1Repository;
		this.validator = validator;
	}

	@Get("/showdowns")
	public List<Showdown> index() {
		return repository.findAll();
	}

	@Post("/showdowns")
	public void create(Showdown showdown) {
		validator.validate(showdown);
		validator.onErrorUsePageOf(this).newShowdown();
		repository.create(showdown);
		result.redirectTo(this).index();
	}

	@Get("/showdowns/new")
	public Showdown newShowdown() {
		result.include("teamList", teamRepository.findAll());
		return new Showdown();
	}

	@Put("/showdowns")
	public void update(Showdown showdown) {
		validator.validate(showdown);
		validator.onErrorUsePageOf(this).edit(showdown);
		repository.update(showdown);
		result.redirectTo(this).index();
	}

	@Get("/showdowns/{showdown.id}/edit")
	public Showdown edit(Showdown showdown) {
		result.include("teamList", teamRepository.findAll());
		return repository.find(showdown.getId());
	}

	@Get("/showdowns/{showdown.id}")
	public Showdown show(Showdown showdown) {
		return repository.find(showdown.getId());
	}

	@Delete("/showdowns/{showdown.id}")
	public void destroy(Showdown showdown) {
		repository.destroy(repository.find(showdown.getId()));
		result.redirectTo(this).index();
	}

}