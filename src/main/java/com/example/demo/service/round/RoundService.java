package com.example.demo.service.round;

import java.util.Collection;

import com.example.demo.model.round.Round;

public interface RoundService {
	
	Round createRound(Round round);
	
	Collection<Round> listRounds(Long id);

}
