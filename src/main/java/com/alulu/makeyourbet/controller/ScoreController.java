package com.alulu.makeyourbet.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

import com.alulu.makeyourbet.model.Score;
import com.alulu.makeyourbet.repository.GameRepository;
import com.alulu.makeyourbet.repository.ScoreRepository;
import com.alulu.makeyourbet.repository.ShowdownRepository;

@Resource
public class ScoreController {

	private final Result result;
	private final ScoreRepository repository;
	private final ShowdownRepository showdownRepository;
	private final GameRepository gameRepository;
	private final Validator validator;

	public ScoreController(Result result, ScoreRepository repository,
			ShowdownRepository showdownRepository,
			GameRepository gameRepository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.showdownRepository = showdownRepository;
		this.gameRepository = gameRepository;
		this.validator = validator;
	}

	@Get("/scores")
	public List<Score> index() {
		return repository.findAll();
	}

	@Post("/scores")
	public void create(Score score) {
		validator.validate(score);
		validator.onErrorUsePageOf(this).newScore();
		repository.create(score);
		result.redirectTo(this).index();
	}

	@Get("/scores/new")
	public Score newScore() {
		result.include("showdownList", showdownRepository.findAll());
		result.include("gameList", gameRepository.findAll());
		return new Score();
	}

	@Put("/scores")
	public void update(Score score) {
		validator.validate(score);
		validator.onErrorUsePageOf(this).edit(score);
		repository.update(score);
		result.redirectTo(this).index();
	}

	@Get("/scores/{score.id}/edit")
	public Score edit(Score score) {
		result.include("showdownList", showdownRepository.findAll());
		result.include("gameList", gameRepository.findAll());
		return repository.find(score.getId());
	}

	@Get("/scores/{score.id}")
	public Score show(Score score) {
		return repository.find(score.getId());
	}

	@Delete("/scores/{score.id}")
	public void destroy(Score score) {
		repository.destroy(repository.find(score.getId()));
		result.redirectTo(this).index();
	}

}