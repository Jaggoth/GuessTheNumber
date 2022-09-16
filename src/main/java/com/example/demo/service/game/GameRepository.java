package com.example.demo.service.game;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {}
