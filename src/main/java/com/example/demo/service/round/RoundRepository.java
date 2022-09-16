package com.example.demo.service.round;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Round;

@Repository
public interface RoundRepository extends CrudRepository<Round, Long> {}
