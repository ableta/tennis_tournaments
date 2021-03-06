package com.tennis.tournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tennis.tournament.entities.Tournament;

@Repository
public interface TournamentRepository  extends JpaRepository<Tournament, Long>{

}
