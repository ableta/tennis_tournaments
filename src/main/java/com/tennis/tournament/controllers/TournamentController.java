package com.tennis.tournament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tennis.tournament.common.ApiResponse;
import com.tennis.tournament.dto.TournamentDTO;
import com.tennis.tournament.services.TournamentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService;

	  @GetMapping("/tournaments")
	  public ApiResponse<List<TournamentDTO>> getAllTournaments() throws JsonProcessingException {
		  
		  return new ApiResponse<>(tournamentService.listTournaments());
		  
	  }
	  
// 
}
