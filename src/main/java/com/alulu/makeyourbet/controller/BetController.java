package com.alulu.makeyourbet.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

import com.alulu.makeyourbet.model.Bet;
import com.alulu.makeyourbet.repository.BetRepository;
import com.alulu.makeyourbet.repository.GameRepository;
import com.alulu.makeyourbet.repository.ShowdownRepository;
import com.alulu.makeyourbet.repository.UserRepository;

@Resource
public class BetController {

	private final Result result;
	private final BetRepository repository;
	private final UserRepository userRepository;
	private final ShowdownRepository showdownRepository;
	private final GameRepository gameRepository;
	private final Validator validator;

	public BetController(Result result, BetRepository repository,
			UserRepository userRepository,
			ShowdownRepository showdownRepository,
			GameRepository gameRepository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.userRepository = userRepository;
		this.showdownRepository = showdownRepository;
		this.gameRepository = gameRepository;
		this.validator = validator;
	}

	@Get("/bets")
	public List<Bet> index() {
		return repository.findAll();
	}

	@Post("/bets")
	public void create(Bet bet) {
		validator.validate(bet);
		validator.onErrorUsePageOf(this).newBet();
		repository.create(bet);
		result.redirectTo(this).index();
	}

	@Get("/bets/new")
	public Bet newBet() {
		result.include("userList", userRepository.findAll());
		result.include("showdownList", showdownRepository.findAll());
		result.include("gameList", gameRepository.findAll());
		return new Bet();
	}

	@Put("/bets")
	public void update(Bet bet) {
		validator.validate(bet);
		validator.onErrorUsePageOf(this).edit(bet);
		repository.update(bet);
		result.redirectTo(this).index();
	}

	@Get("/bets/{bet.id}/edit")
	public Bet edit(Bet bet) {
		result.include("userList", userRepository.findAll());
		result.include("showdownList", showdownRepository.findAll());
		result.include("gameList", gameRepository.findAll());
		return repository.find(bet.getId());
	}

	@Get("/bets/{bet.id}")
	public Bet show(Bet bet) {
		return repository.find(bet.getId());
	}

	@Delete("/bets/{bet.id}")
	public void destroy(Bet bet) {
		repository.destroy(repository.find(bet.getId()));
		result.redirectTo(this).index();
	}

}