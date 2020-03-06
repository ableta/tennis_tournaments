package com.tennis.tournament.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tennis.tournament.common.ApiResponse;
import com.tennis.tournament.dto.TournamentDTO;
import com.tennis.tournament.entities.Tournament;
import com.tennis.tournament.repositories.TournamentRepository;
import com.tennis.tournament.services.TournamentService;

@RestController
@RequestMapping("/api/v1")
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService;

	  @GetMapping("/tournaments")
	  public ApiResponse<List<TournamentDTO>> getAllTournaments() throws JsonProcessingException {
		  
		  return new ApiResponse<>(tournamentService.listTournaments());
		  
	  }
	  
//	  
}
