package com.alulu.makeyourbet.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

import com.alulu.makeyourbet.model.Game;
import com.alulu.makeyourbet.repository.GameRepository;

@Resource
public class GameController {

	private final Result result;
	private final GameRepository repository;
	private final Validator validator;

	public GameController(Result result, GameRepository repository,
			Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}

	@Get("/games")
	public List<Game> index() {
		return repository.findAll();
	}

	@Post("/games")
	public void create(Game game) {
		validator.validate(game);
		validator.onErrorUsePageOf(this).newGame();
		repository.create(game);
		result.redirectTo(this).index();
	}

	@Get("/games/new")
	public Game newGame() {
		return new Game();
	}

	@Put("/games")
	public void update(Game game) {
		validator.validate(game);
		validator.onErrorUsePageOf(this).edit(game);
		repository.update(game);
		result.redirectTo(this).index();
	}

	@Get("/games/{game.id}/edit")
	public Game edit(Game game) {
		return repository.find(game.getId());
	}

	@Get("/games/{game.id}")
	public Game show(Game game) {
		return repository.find(game.getId());
	}

	@Delete("/games/{game.id}")
	public void destroy(Game game) {
		repository.destroy(repository.find(game.getId()));
		result.redirectTo(this).index();
	}

}