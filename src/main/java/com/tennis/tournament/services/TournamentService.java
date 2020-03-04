package com.tennis.tournament.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tennis.tournament.models.Tournament;
import com.tennis.tournament.repositories.TournamentRepository;

@Service


public class TournamentService {

	private final TournamentRepository tournametRepository;
	
	public TournamentService(TournamentRepository tournametRepository) {
		this.tournametRepository = tournametRepository;
	}
	
	public List<Tournament> findAll() {
		
		return tournametRepository.findAll();
	}
	
	
	  public Tournament save(Tournament tournament) {
		  return tournametRepository.save(tournament);
	  }
	
	
	
}
