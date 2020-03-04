package com.tennis.tournament.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tennis.tournament.models.Tournament;
import com.tennis.tournament.repositories.TournamentRepository;
import com.tennis.tournament.services.TournamentService;

@RestController
@RequestMapping("/api/v1")
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService;

	  @GetMapping("/tournaments")
	  public List<Tournament> listAll() {
		
		 return tournamentService.findAll();
	  }
	  
	  @PostMapping("/tournaments")
	  public Tournament createTournament(@Valid @RequestBody Tournament tournament) {
		  return tournamentService.save(tournament);
	  }
	  
}
