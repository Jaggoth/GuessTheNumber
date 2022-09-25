package com.example.demo.service.game;

import com.example.demo.model.game.Game;

public interface GameService {
	
	Game createGame(Game game);
	
	Game findGame(Long id);
	
	Iterable<Game> listGames();
	
	Game endGame(Long id);
}
