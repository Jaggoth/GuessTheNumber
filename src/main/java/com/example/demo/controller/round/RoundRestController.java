package com.example.demo.controller.round;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.round.Round;
import com.example.demo.service.round.RoundServiceImplementation;

@RestController
public class RoundRestController {

	@Autowired
	private RoundServiceImplementation roundServiceImpl;

	@PostMapping("/guess")
	public Round guess(@RequestBody Round round){
		return roundServiceImpl.createRound(round);
	}

	@GetMapping("/rounds/{id}")
	public Collection<Round> findRounds(@PathVariable Long id){
		return roundServiceImpl.listRounds(id);
	}
}
